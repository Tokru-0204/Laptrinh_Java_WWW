package org.example.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.example.resources")
@PropertySource("classpath:application.properties")
public class AppConfig {
    @Bean
    public ClientBean clientBean(){
        return new ClientBean();
    }
}
