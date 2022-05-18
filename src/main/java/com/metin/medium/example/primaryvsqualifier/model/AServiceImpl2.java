package com.metin.medium.example.primaryvsqualifier.model;

import org.springframework.stereotype.Service;

@Service
public class AServiceImpl2 implements AService {

    @Override
    public void info() {
        System.out.println("..AServiceImpl2..");
    }
}
