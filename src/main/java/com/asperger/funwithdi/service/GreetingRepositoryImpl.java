package com.asperger.funwithdi.service;

public class GreetingRepositoryImpl implements GreetingRepository {

    @Override
    public String getEnglishGreeting() {
        return "Hello there";
    }

    @Override
    public String getSpanishGreeting() {
        return "Hola mi compadre";
    }

    @Override
    public String getGermanGreeting() {
        return "Guten Mogen";
    }
}
