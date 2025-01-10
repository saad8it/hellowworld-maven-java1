package com.example;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public int computeSum(int a, int b) {
        return a + b;
    }
}
