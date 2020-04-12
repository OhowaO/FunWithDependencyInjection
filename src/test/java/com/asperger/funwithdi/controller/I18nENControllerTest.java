package com.asperger.funwithdi.controller;

import com.asperger.funwithdi.service.I18nEnglishService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles("EN")
class I18nENControllerTest {

    private I18nController i18nController;

    @BeforeEach
    void setUp() {
        this.i18nController = new I18nController(new I18nEnglishService());
    }

    @Test
    void sayHelloTest() {
        i18nController.sayHello().equals(new I18nEnglishService().getGreeting());
    }
}
