package com.hackt.config;

import com.hackt.database.Generals;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.sql.Connection;

@Configuration
@EnableWebMvc

public class WebConfig extends WebMvcConfigurationSupport {

    @Bean
    public InternalResourceViewResolver resolver(){
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/pages/");
        resolver.setSuffix(".jsp");
        return resolver;
    }

    public void configureDefaulServletHandling(DefaultServletHandlerConfigurer configurer){
        configurer.enable();
    }

}
