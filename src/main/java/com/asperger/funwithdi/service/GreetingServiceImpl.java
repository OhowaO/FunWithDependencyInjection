package com.asperger.funwithdi.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String getGreeting() {
        return "Hello from Greeting Service Impl which is the primary bean";
    }
}
