package com.asperger.funwithdi.controller;

import com.asperger.funwithdi.service.GreetingRepository;
import com.asperger.funwithdi.service.GreetingRepositoryImpl;
import com.asperger.funwithdi.service.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingServiceControllerTest {

    private GreetingServiceController greetingService;
    private GreetingRepository greetingRepository;

    @BeforeEach
    void setUp() {
        this.greetingRepository = new GreetingRepositoryImpl();
        this.greetingService =
                new GreetingServiceController(new GreetingServiceImpl(this.greetingRepository));
    }

    @Test
    void sayHelloTest() {
        this.greetingService.sayHello().equals(new GreetingServiceImpl(this.greetingRepository).getGreeting());
    }
}
