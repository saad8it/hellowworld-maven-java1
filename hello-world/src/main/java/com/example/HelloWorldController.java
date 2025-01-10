package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Autowired
    private CalculatorService calculatorService;

    @GetMapping("/hello-world")
    public String helloWorld() {
        int result = calculatorService.computeSum(5, 10);
        System.out.println("Computed Result: " + result); // Console log
        return "Hello World! The computed result is: " + result;
    }
}
