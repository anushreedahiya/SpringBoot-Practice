package com.example.Anushree_advanced_spring_data_jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class AnushreeAdvancedSpringDataJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(AnushreeAdvancedSpringDataJpaApplication.class, args);
    }

}
