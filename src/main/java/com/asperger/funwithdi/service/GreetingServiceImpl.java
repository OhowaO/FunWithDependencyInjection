package com.asperger.funwithdi.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String getGreeting() {
        return "Hi there!";
    }
}