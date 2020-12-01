//package apocalypse.cloudpartybuilding.config;
//
//
//import de.codecentric.boot.admin.server.config.AdminServerProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
//import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
//
//@Configuration
////@EnableWebSecurity(debug = true)//已经自动配置了，此处只是为了打印debug信息
////@EnableGlobalMethodSecurity(prePostEnabled = true) //开启security注解
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//    private final String adminContextPath;
//    public SecurityConfig(AdminServerProperties adminServerProperties) {
//        this.adminContextPath = adminServerProperties.getContextPath();
//    }
//    /**
//     * 静态资源设置
//     */
//    @Override
//    public void configure(WebSecurity webSecurity) {
//        //不拦截静态资源,所有用户均可访问的资源
//        webSecurity.ignoring().antMatchers(
//                "/",
//                "/css/**",
//                "/js/**",
//                "/images/**",
//                "/layui/**"
//        );
//    }
//
//    //告诉系统我的密码不加密，输入账号和密码就可以登录上来
//    // 指定密码的加密方式
//    @SuppressWarnings("deprecation")
//    @Bean
//    PasswordEncoder passwordEncoder(){
//        // 不对密码进行加密
//        return NoOpPasswordEncoder.getInstance();
//    }
//
//    //配置用户及其对应的角色
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication() //内存认证
//                .withUser("root").password("123").roles("ADMIN","DBA") //root用户拥有admin和dba角色，密码为123
//                .and() //模块结尾
//                .withUser("admin").password("123").roles("ADMIN","USER")
//                .and()
//                .withUser("hangge").password("123").roles("USER");
//
//    }
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        SavedRequestAwareAuthenticationSuccessHandler successHandler = new SavedRequestAwareAuthenticationSuccessHandler();
//        successHandler.setTargetUrlParameter("redirectTo");
//        successHandler.setDefaultTargetUrl(adminContextPath + "/");
//        // 定制请求的授权规则
//        http.authorizeRequests()
//                .antMatchers("/login/**","/initUserData").permitAll() //不拦截登录相关方法
//                .antMatchers("/admin/**").hasRole("ADMIN") // admin模式URL必须具备ADMIN角色
//                .antMatchers("/user/**").access("hasAnyRole('ADMIN','USER')") // 该模式需要ADMIN或USER角色
//                .antMatchers("/chat/**").access("hasRole('ADMIN') and hasRole('DBA')")// 需ADMIN和DBA角色
//                .anyRequest().authenticated()// 任何尚未匹配的URL只需要验证用户即可访问
//                .antMatchers(adminContextPath + "/assets/**").permitAll()//Grants public access to all static assets and the login page.
//                .antMatchers(adminContextPath + "/login").permitAll()
//                .anyRequest().authenticated();//	Every other request must be authenticated.
//        http
//                .formLogin()
//                .loginPage(adminContextPath+"/login")
//                .successHandler(successHandler);
//        http
//                .logout()
//                .logoutUrl(adminContextPath+ "/logout");
//        http.httpBasic();//Enables HTTP-Basic support. This is needed for the Spring Boot Admin Client to register.
//        http.csrf()
//                .csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())//	Enables CSRF-Protection using Cookies
//                .ignoringAntMatchers(
//                        adminContextPath + "/instances",//	Disables CRSF-Protection the endpoint the Spring Boot Admin Client uses to register.
//                        adminContextPath + "/actuator/**"//Disables CRSF-Protection for the actuator endpoints.
//                );
//
////        http.formLogin()
////                .loginPage("/")
////                .loginPage("/login")   //登录请求页
////                .loginProcessingUrl("/login")  //登录POST请求路径
////                .usernameParameter("username") //登录用户名参数
////                .passwordParameter("password") //登录密码参数
////                .defaultSuccessUrl("/main");   //默认登录成功页面
////        http.logout()
////                .logoutSuccessUrl("/login?logout");  //退出登录成功URL
////        //定制记住我的参数！
////        http.rememberMe().rememberMeParameter("remember");
////        http.csrf().disable(); // 关闭csrf
//    }
//
//
////    //配置 URL 访问权限
////    @Override
////    protected  void configure(HttpSecurity http) throws Exception {
////        http.authorizeRequests()
//////              .antMatchers("/").permitAll()// 开启 HttpSecurity 配置
////                .antMatchers("/admin/**").hasRole("ADMIN") // admin/** 模式URL必须具备ADMIN角色
////                .antMatchers("/user/**").access("hasAnyRole('ADMIN','USER')") // 该模式需要ADMIN或USER角色
////                .antMatchers("/db/**").access("hasRole('ADMIN') and hasRole('DBA')");// 需ADMIN和DBA角色
////                .anyRequest().authenticated();// 用户访问其它URL都必须认证后访问（登录后访问）
////        http.formLogin()
////                .loginPage("/login.html")
////                .loginProcessingUrl("/authentication/form")
////                .and()
////                .authorizeRequests()
////                .antMatchers("/login.html").permitAll() //当请求url符合这个路径时不进行身份认证
////                .anyRequest()
////                .authenticated();
////        http.logout().logoutSuccessUrl("/login");
////        http.csrf().disable(); // 关闭csrf
//   }
//
//
