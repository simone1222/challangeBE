package com.progetto.challangeFilm.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**") // specifica il percorso delle API che vuoi abilitare CORS
                .allowedOrigins("http://localhost:4200") // consenti richieste solo dall'origine specificata (Angular)
                .allowedMethods("GET", "POST", "PUT", "DELETE") // specifica i metodi HTTP consentiti
                .allowCredentials(true); // consente l'invio dei cookie
    }
}

