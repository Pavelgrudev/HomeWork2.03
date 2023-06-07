package com.example.homework203;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public String welcome() {
        return "Добро пожаловать в калькулятор ";
    }

    public double calculatorPlus(double num1, double num2) {
        return num1 + num2;
    }

    public double calculatorMinus(double num1, double num2) {
        return num1 - num2;
    }

    public double calculatorMultiply(double num1, double num2) {
        return num1 * num2;
    }

    public double calculatorDivide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new IllegalArgumentException("На ноль делить нельзя");
        }
    }

    }




            /*  Написать 5 методов, которые при вызове из браузера делают следующее:

            1. Метод по адресу /calculator должен вернуть приветствие “Добро пожаловать в калькулятор".

            2. Метод по адресу /calculator/plus?num1=5&num2=5 должен сложить num1 и num2 и вернуть результат в формате “5 + 5 = 10”.

            3. Метод по адресу /calculator/minus?num1=5&num2=5 должен вычесть из num1 num2 и вернуть результат в формате “5 − 5 = 0”.

            4. Метод по адресу /calculator/multiply?num1=5&num2=5 должен умножить num1 на num2 и вернуть результат в формате “5 * 5 = 25”.

            5. Метод по адресу /calculator/divide?num1=5&num2=5 должен разделить num1 на num2 и вернуть результат в формате “5 / 5 = 1”.*/

