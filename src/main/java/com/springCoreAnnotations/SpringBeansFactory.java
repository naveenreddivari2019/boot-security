package com.springCoreAnnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.springCoreAnnotations")
public class SpringBeansFactory {
    @Bean(name = "addr")
    public Address setAddress(){
        return new Address();
    }
}
