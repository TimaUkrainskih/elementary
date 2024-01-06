package ru.calculator;

import static ru.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double divideAndSubtraction(double first, double second) {
        return divide(first, second)
                + subtraction(first, second);
    }

    public static double allMathFunction(double first, double second) {
        return sumAndMultiply(first, second)
                + divideAndSubtraction(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
    }

}