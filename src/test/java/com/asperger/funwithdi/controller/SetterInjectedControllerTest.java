package com.asperger.funwithdi.controller;

import com.asperger.funwithdi.service.GreetingServiceImpl;
import com.asperger.funwithdi.service.SetterGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {

    private SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        this.controller = new SetterInjectedController();
        this.controller.setGreetingService(new SetterGreetingService());
    }

    @Test
    void sayHelloTest() {
        this.controller.sayHello().equals(new SetterGreetingService().getGreeting());
    }
}
