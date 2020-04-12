package com.asperger.funwithdi.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyGreetingServiceTest {

    private PropertyGreetingService greetingService;

    @BeforeEach
    void setUp() {
        this.greetingService = new PropertyGreetingService();
    }

    @Test
    void getGreetingTest() {
        this.greetingService.getGreeting().equals("Hi there - Property");
    }
}
