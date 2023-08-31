package com.sayan.SPRINGJPA.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.ArrayDeque;

@Configuration
public class SwaggerConfig {
    @Bean
    public Docket docket(){
        Docket docket = new Docket(DocumentationType.SWAGGER_2);
        docket.apiInfo(getApiInfo());
        return docket;
    }

    private ApiInfo getApiInfo() {
        ApiInfo apiInfo = new ApiInfo(
                "spring jpa by sayan",
                "this is just a testing file of jpa",
                "1.0.0V",
                "https://wwww.google.com",
                new Contact("sayan","https://wwww.google.com","sayankarmakar09990@gmail.com"),
                "licence of APIs",
                "https://wwww.google.com",
                new ArrayDeque<>()
        );
        return apiInfo;
    }
}
