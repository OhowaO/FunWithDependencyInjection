package com.asperger.funwithdi.controller;

import com.asperger.funwithdi.service.I18nSpanishService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class I18nESControllerTest {

    private I18nController i18nController;

    @BeforeEach
    void setUp() {
        this.i18nController = new I18nController(new I18nSpanishService());
    }

    @Test
    void sayHelloTest() {
        i18nController.sayHello().equals(new I18nSpanishService().getGreeting());
    }
}
