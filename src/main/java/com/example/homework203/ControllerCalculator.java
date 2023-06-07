package com.example.homework203;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
public class ControllerCalculator {
    private final CalculatorService service;
    public ControllerCalculator(CalculatorService service) {
        this.service = service;}
    @GetMapping
    public String welcome() {
        return "Добро пожаловать в калькулятор ";
    }
   @GetMapping(path="plus")
    public String calculatorPlus(@RequestParam double num1 , @RequestParam double num2){
        double result = service.calculatorPlus(num1,num2);
        return String.format("Результат сложения %.2f+%.2f=%.2f" ,num1,num2,result);
    }
    @GetMapping(path="minus")
    public String calculatorMinus(@RequestParam  double num1, @RequestParam  double num2){
        double result=service.calculatorMinus(num1, num2);
        return String.format("Результат вычитания %.2f-%.2f=%.2f" ,num1,num2,result);
    }
    @GetMapping(path="multiply")
    public String calculatorMultiply(@RequestParam double num1, @RequestParam double num2) {
        double result = service.calculatorMultiply(num1, num2);
        return String.format("Результат умножения %.2f*%.2f=%.2f", num1, num2, result);}

        @GetMapping(path = "divide")
        public String calculatorDivide ( @RequestParam double num1, @RequestParam double num2){
            double result = service.calculatorDivide(num1, num2);
            return String.format("Результат деления %.2f/%.2f=%.2f", num1, num2, result);
        }
    }



