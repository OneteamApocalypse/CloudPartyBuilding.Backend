package apocalypse.cloudpartybuilding.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 资源映射路径
 */
@Configuration
public class MyWebAppConfigurer implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/temp-rainy/**").addResourceLocations("file:D:/temp-rainy/");
    }
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("/files/findex").setViewName("flogin");
//        registry.addViewController("/files/fshow").setViewName("fshowAll");
//        registry.addViewController("/files/filerest").setViewName("file");
        registry.addViewController("/chat").setViewName("index2");
    }

}