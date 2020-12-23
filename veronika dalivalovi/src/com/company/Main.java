package calculator;

import calculator.service.impl.CalculatorServiceImpl;

public class Main {
    public static void main(String[] args) {
        CalculatorServiceImpl c = new CalculatorServiceImpl();
        System.out.println(c.prod(4,2));
        System.out.println(c.sum(2,4));
    }
}