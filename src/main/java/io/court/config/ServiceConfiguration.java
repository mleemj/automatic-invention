package io.court.config;

import io.court.service.ReservationService;
import io.court.service.ReservationServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfiguration {

    @Bean
    public ReservationService reservationService() {
        return new ReservationServiceImpl();
    }
}
