package com.asperger.funwithdi.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

public class GreetingServiceImpl implements GreetingService {

    private GreetingRepository greetingRepository;

    public GreetingServiceImpl(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String getGreeting() {
        return this.greetingRepository.getEnglishGreeting();
    }
}
