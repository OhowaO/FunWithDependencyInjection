package com.asperger.funwithdi.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorGreetingServiceTest {

    private ConstructorGreetingService greetingService;

    @BeforeEach
    void setUp() {
        this.greetingService = new ConstructorGreetingService();
    }

    @Test
    void getGreetingTest() {
        greetingService.getGreeting().equals("Hi there - Constructor");
    }
}
