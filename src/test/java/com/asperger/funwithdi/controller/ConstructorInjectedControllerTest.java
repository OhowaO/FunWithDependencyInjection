package com.asperger.funwithdi.controller;

import com.asperger.funwithdi.service.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {

    private ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        this.controller =
                new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    void sayHelloTest() {
        this.controller.sayHello().equals(new GreetingServiceImpl().getGreeting());
    }
}
