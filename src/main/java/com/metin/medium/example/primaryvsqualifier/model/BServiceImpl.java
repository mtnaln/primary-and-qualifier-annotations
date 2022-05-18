package com.metin.medium.example.primaryvsqualifier.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BServiceImpl {

    @Autowired
    @Qualifier("AServiceImpl2")
    private AService aService;

    public void info() {
        aService.info();
    }
}
