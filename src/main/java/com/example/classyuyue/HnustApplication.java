package com.example.classyuyue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.definesys.mpaas","com.example.classyuyue"})
@SpringBootApplication
public class HnustApplication {

    public static void main(String[] args) {
        SpringApplication.run(HnustApplication.class, args);
    }

}