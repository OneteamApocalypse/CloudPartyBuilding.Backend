package apocalypse.cloudpartybuilding.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import de.codecentric.boot.admin.server.config.AdminServerProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.security.web.authentication.logout.LogoutHandler;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class SecuritySecureConfig extends WebSecurityConfigurerAdapter {
    private final String adminContextPath;

    public SecuritySecureConfig(AdminServerProperties adminServerProperties) {
        this.adminContextPath = adminServerProperties.getContextPath();
    }
        /**
     * 静态资源设置
     */
    @Override
    public void configure(WebSecurity webSecurity) {
        //不拦截静态资源,所有用户均可访问的资源
        webSecurity.ignoring().antMatchers(
                "/",
                "/css/**",
                "/js/**",
                "/images/**",
                "/layui/**"
        );
    }

    //告诉系统我的密码不加密，输入账号和密码就可以登录上来
    // 指定密码的加密方式
    @SuppressWarnings("deprecation")
    @Bean
    PasswordEncoder passwordEncoder() {
        // 不对密码进行加密
        return NoOpPasswordEncoder.getInstance();
    }

    //配置用户及其对应的角色
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication() //内存认证
                .withUser("root").password("123").roles("ADMIN", "DBA") //root用户拥有admin和dba角色，密码为123
                .and() //模块结尾
                .withUser("admin").password("123").roles("ADMIN", "USER")
                .and()
                .withUser("hangge").password("123").roles("USER");
    }

    // 配置 URL 访问权限
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // @formatter:off
        SavedRequestAwareAuthenticationSuccessHandler successHandler = new SavedRequestAwareAuthenticationSuccessHandler();
        successHandler.setTargetUrlParameter("redirectTo");
        successHandler.setDefaultTargetUrl(adminContextPath + "/");

        http.authorizeRequests()// 开启 HttpSecurity 配置
                // 授予对所有静态资产和登录页面的公共访问权限
                .antMatchers(adminContextPath + "/assets/**").permitAll()
                // 授予对所有静态资产和登录页面的公共访问权限
                .antMatchers(adminContextPath + "/login").permitAll()

                .antMatchers("/admin/**").hasRole("ADMIN") // admin/** 模式URL必须具备ADMIN角色
                .antMatchers("/fileg/**").hasRole("DBA")
                .antMatchers("/user/**").access("hasAnyRole('ADMIN','USER')") // 该模式需要ADMIN或USER角色
                .antMatchers("/chat/**").access("hasRole('ADMIN') and hasRole('DBA')")// 需ADMIN和DBA角色
                .and()
                // 所有请求都需要验证登录
                .authorizeRequests().anyRequest().authenticated()
                .and()
                // 登录表单
                .formLogin().loginPage(adminContextPath + "/login").successHandler(successHandler).and()//Configures login and logout.
                .httpBasic().and()//Enables HTTP-Basic support. This is needed for the Spring Boot Admin Client to register.
                .csrf().csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse()).ignoringAntMatchers(
                           //	将服务注册的接口暴露出去.
                        adminContextPath + "/instances",//	Disables CRSF-Protection the endpoint the Spring Boot Admin Client uses to register.
                        adminContextPath + "/actuator/**"//Disables CRSF-Protection for the actuator endpoints.
                )
                .ignoringAntMatchers("/druid/*");
        // 登出表单
        http.logout()
                .logoutUrl("/doLogout")
                //注销之后 跳转的页面
                .logoutSuccessUrl(adminContextPath + "/login")
                .clearAuthentication(true) // 清除身份认证信息
                .invalidateHttpSession(true); // 使 session 失效

    }

}