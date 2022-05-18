package com.metin.medium.example.primaryvsqualifier;

import com.metin.medium.example.primaryvsqualifier.model.BServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimaryVsQualifierApplication implements CommandLineRunner {

    @Autowired
    private BServiceImpl bService;

    public static void main(String[] args) {
        SpringApplication.run(PrimaryVsQualifierApplication.class, args);
    }

    @Override
    public void run(String... args) {
        bService.info();
    }
}
