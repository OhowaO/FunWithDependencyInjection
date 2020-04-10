package com.asperger.funwithdi.controller;

import com.asperger.funwithdi.service.GreetingService;
import com.asperger.funwithdi.service.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController extends MyController{

    private GreetingService greetingService;

    @Autowired
    public void setGreetingService(GreetingServiceImpl greetingService){
        this.greetingService = greetingService;
    }

    @Override
    public String sayHello() {
        return this.greetingService.getGreeting();
    }
}
