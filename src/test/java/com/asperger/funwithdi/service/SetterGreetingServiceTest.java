package com.asperger.funwithdi.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterGreetingServiceTest {

    private SetterGreetingService greetingService;

    @BeforeEach
    void setUp() {
        this.greetingService = new SetterGreetingService();
    }

    @Test
    void getGreetingTest() {
        greetingService.getGreeting().equals("Hi there - Setter");
    }
}
