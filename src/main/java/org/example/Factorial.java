package org.example;

public class Factorial {

    public static long factorial(long n) {
        if (n < 0) {
            throw new IllegalArgumentException("Введите целое неотрицательное число.");
        } else if (n == 0) {
            return 1;
        }
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}