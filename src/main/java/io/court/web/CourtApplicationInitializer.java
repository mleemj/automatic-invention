package io.court.web;

import io.court.config.ServiceConfiguration;
import io.court.config.WebConfiguration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class CourtApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{ServiceConfiguration.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{WebConfiguration.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/", "/welcome"};
    }
}
