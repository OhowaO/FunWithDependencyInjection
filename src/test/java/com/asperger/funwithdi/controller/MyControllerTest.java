package com.asperger.funwithdi.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyControllerTest {

    @Test
    void sayHelloTest() {
        new MyController().sayHello().equals("Hello");
    }
}
