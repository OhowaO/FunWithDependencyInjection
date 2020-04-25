package com.asperger.funwithdi.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingServiceImplTest {

    private GreetingServiceImpl greetingService;
    private GreetingRepository greetingRepository;

    @BeforeEach
    void setUp() {
        this.greetingRepository = new GreetingRepositoryImpl();
        this.greetingService = new GreetingServiceImpl(this.greetingRepository);
    }

    @Test
    void getGreetingTest() {
        this.greetingService.getGreeting().equals(new String("Hello from Greeting Service Impl which is the primary bean"));
    }
}
