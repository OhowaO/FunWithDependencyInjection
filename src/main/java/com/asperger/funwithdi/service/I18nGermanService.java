package com.asperger.funwithdi.service;

public class I18nGermanService implements GreetingService {

    private GreetingRepository greetingRepository;

    public I18nGermanService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String getGreeting() {
        return this.greetingRepository.getGermanGreeting();
    }
}
