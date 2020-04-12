package com.asperger.funwithdi.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingServiceImplTest {

    private GreetingServiceImpl greetingService;

    @BeforeEach
    void setUp() {
        this.greetingService = new GreetingServiceImpl();
    }

    @Test
    void getGreetingTest() {
        this.greetingService.getGreeting().equals(new String("Hello from Greeting Service Impl which is the primary bean"));
    }
}
