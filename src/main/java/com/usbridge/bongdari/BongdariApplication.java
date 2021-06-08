package com.usbridge.bongdari;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class BongdariApplication {
    public static void main(String[] args) {
        SpringApplication.run(BongdariApplication.class, args);
    }
}
