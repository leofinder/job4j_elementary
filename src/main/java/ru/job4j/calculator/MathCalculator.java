package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double subAndDivide(double first, double second) {
        return sub(first, second)
                + divide(first, second);
    }

    public static double sumAndSubAndMultiplyAndDivide(double first, double second) {
        return sum(first, second)
                + sub(first, second)
                + multiply(first, second)
                + divide(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета 'sumAndMultiply' равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета 'subAndDivide' равен: " + subAndDivide(10, 20));
        System.out.println("Результат расчета 'sumAndSubAndMultiplyAndDivide' равен: " + sumAndSubAndMultiplyAndDivide(10, 20));
    }
}
