package com.asperger.funwithdi.controller;

import com.asperger.funwithdi.service.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController extends MyController {

    @Autowired
    private GreetingServiceImpl greetingService ;

    @Override
    public String sayHello() {
        return greetingService.getGreeting();
    }
}
