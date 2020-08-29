package de.vm.webflux.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

@SpringBootApplication ( scanBasePackages =  {"de.vm.webflux.demo"})
public class WebfluxFunctionalApp {
 
    public static void main(String[] args) {
        SpringApplication.run(WebfluxFunctionalApp.class, args);
    }
}