package org.example;

public class Main {
    public static void main(String[] args) {
        Ints calc = new IntsCalculator();
        System.out.println(calc.sum(2, 2));  // 4
        System.out.println(calc.mult(10, 22));  // 220
        System.out.println(calc.pow(2, 10));  // 1024
    }
}