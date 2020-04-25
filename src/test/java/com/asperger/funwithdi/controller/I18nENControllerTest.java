package com.asperger.funwithdi.controller;

import com.asperger.funwithdi.service.GreetingRepository;
import com.asperger.funwithdi.service.GreetingRepositoryImpl;
import com.asperger.funwithdi.service.I18nEnglishService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles("EN")
class I18nENControllerTest {

    private I18nController i18nController;
    private GreetingRepository greetingRepository;

    @BeforeEach
    void setUp() {
        this.greetingRepository = new GreetingRepositoryImpl();
        this.i18nController = new I18nController(new I18nEnglishService(this.greetingRepository));
    }

    @Test
    void sayHelloTest() {
        i18nController.sayHello().equals(new I18nEnglishService(this.greetingRepository).getGreeting());
    }
}
