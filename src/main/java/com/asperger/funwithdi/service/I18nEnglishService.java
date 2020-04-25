package com.asperger.funwithdi.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

public class I18nEnglishService implements GreetingService{

    private GreetingRepository greetingRepository;

    public I18nEnglishService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String getGreeting() {
        return this.greetingRepository.getEnglishGreeting();
    }
}
