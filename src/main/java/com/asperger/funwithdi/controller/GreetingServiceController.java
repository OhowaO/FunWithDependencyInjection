package com.asperger.funwithdi.controller;

import com.asperger.funwithdi.service.GreetingService;
import com.asperger.funwithdi.service.GreetingServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceController extends MyController {

    private GreetingService greetingService;

    public GreetingServiceController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @Override
    public String sayHello() {
        return greetingService.getGreeting();
    }
}
