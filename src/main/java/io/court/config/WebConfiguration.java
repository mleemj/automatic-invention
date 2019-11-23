package io.court.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.ResourceBundleViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"io.court.web"})
public class WebConfiguration {
    @Bean
    public InternalResourceViewResolver internalResourceViewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setOrder(1);
        viewResolver.setPrefix("/WEB-INF/jsp/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }

    @Bean
    public ResourceBundleViewResolver resourceBundleViewResolver() {
        ResourceBundleViewResolver resourceBundleViewResolver = new ResourceBundleViewResolver();
        resourceBundleViewResolver.setOrder(0);
        resourceBundleViewResolver.setBasename("config-view");
        return resourceBundleViewResolver;
    }
}
