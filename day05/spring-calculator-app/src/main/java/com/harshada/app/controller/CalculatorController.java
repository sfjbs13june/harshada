package com.harshada.app.controller;

import com.harshada.app.process.Calculator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class CalculatorController {

    private final Calculator calculator;

    public CalculatorController(Calculator calculator){
        this.calculator = calculator;

    }

    @GetMapping("/add")
    public double addition(@RequestParam("a") int a, @RequestParam("b") int b){
        return a+b;
    }
    @GetMapping("/sub")
    public double substraction(@RequestParam("a") int a,@RequestParam("b") int b){
        return a-b;
    }
    @GetMapping("/mul")
    public double multiplication(@RequestParam("a") int a,@RequestParam("b") int b){
        return a*b;
    }
    @GetMapping("/div")
    public double division(@RequestParam("a") int a,@RequestParam("b") int b){
        return a/b;
    }

    @GetMapping("/addstr")
    public String stringAdd(@RequestParam("a") String a,@RequestParam("b") String b){
        return calculator.addString(a,b);
    }

    @GetMapping("/avg")
    public float averageValue(@RequestParam("a") int a,@RequestParam("b") int b){
        return calculator.averageData(a,b);
    }

}
