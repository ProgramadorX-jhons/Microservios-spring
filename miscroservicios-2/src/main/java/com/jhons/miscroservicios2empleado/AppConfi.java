package com.jhons.miscroservicios2empleado;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfi {

    @Bean("clienteRest")
    RestTemplate registrarRestTemplate() {
        return new RestTemplate();
    }
}
