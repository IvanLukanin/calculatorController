package com.example.skyprocalculator.controller;

import com.example.skyprocalculator.service.CalculatorService;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    public String plus(@RequestParam int num1,@RequestParam int num2){
        return num1 + "+" + num2 + "=" + calculatorService.plus(num1, num2);
    }
}
