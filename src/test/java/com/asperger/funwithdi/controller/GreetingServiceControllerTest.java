package com.asperger.funwithdi.controller;

import com.asperger.funwithdi.service.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingServiceControllerTest {

    private GreetingServiceController greetingService;

    @BeforeEach
    void setUp() {
        this.greetingService =
                new GreetingServiceController(new GreetingServiceImpl());
    }

    @Test
    void sayHelloTest() {
        this.greetingService.sayHello().equals(new GreetingServiceImpl().getGreeting());
    }
}
