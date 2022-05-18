package com.metin.medium.example.primaryvsqualifier.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class AServiceImpl1 implements AService {

    @Override
    public void info() {
        System.out.println("..AServiceImpl1..");
    }
}
