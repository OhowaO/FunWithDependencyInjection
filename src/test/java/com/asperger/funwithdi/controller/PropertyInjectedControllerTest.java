package com.asperger.funwithdi.controller;

import com.asperger.funwithdi.service.PropertyGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {

    private PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        this.controller = new PropertyInjectedController();
        this.controller.greetingService = new PropertyGreetingService();
    }

    @Test
    void sayHelloTest() {
        controller.sayHello().equals(new PropertyGreetingService().getGreeting());
    }
}
