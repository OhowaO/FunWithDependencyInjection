package com.asperger.funwithdi.controller;

import com.asperger.funwithdi.service.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18nController extends MyController {

    private GreetingService greetingService;

    public I18nController(@Qualifier("i18nService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @Override
    public String sayHello() {
        return greetingService.getGreeting();
    }
}
