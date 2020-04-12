package com.asperger.funwithdi.controller;

import com.asperger.funwithdi.service.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {

    private PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        this.controller = new PropertyInjectedController();
        this.controller.greetingService = new GreetingServiceImpl();
    }

    @Test
    void sayHelloTest() {
        controller.sayHello().equals(new GreetingServiceImpl().getGreeting());
    }
}
