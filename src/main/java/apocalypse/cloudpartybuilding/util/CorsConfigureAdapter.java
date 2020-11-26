package apocalypse.cloudpartybuilding.util;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.*;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@Configuration
@EnableWebMvc
class CorsConfigureAdapter extends WebMvcConfigurerAdapter {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        super.addCorsMappings(registry);
        registry.addMapping("/**");
    }
}