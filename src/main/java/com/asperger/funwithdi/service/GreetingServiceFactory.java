package com.asperger.funwithdi.service;

public class GreetingServiceFactory {

    private GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createNewGreetingService(String lang){
        switch (lang){
            case "en":
                return new I18nEnglishService(this.greetingRepository);
            case "es":
                return new I18nSpanishService(this.greetingRepository);
            case "de":
                return new I18nGermanService(this.greetingRepository);
            default:
                return new GreetingServiceImpl(this.greetingRepository);
        }
    }
}
