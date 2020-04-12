package com.asperger.funwithdi.controller;


import com.asperger.funwithdi.service.ConstructorGreetingService;
import com.asperger.funwithdi.service.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController extends MyController{

    private final ConstructorGreetingService greetingService;

    public ConstructorInjectedController(ConstructorGreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @Override
    public String sayHello(){
        return greetingService.getGreeting();
    }
}
