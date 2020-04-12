package com.asperger.funwithdi.service;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingService implements GreetingService{

    @Override
    public String getGreeting() {
        return "Hi there - Property";
    }
}
