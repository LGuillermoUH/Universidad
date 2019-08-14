package com.empleos.empleos3;

import it.ozimov.springboot.mail.configuration.EnableEmailTools;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEmailTools
public class Empleos3Application {

    public static void main(String[] args) {
        SpringApplication.run(Empleos3Application.class, args);
    }

}
