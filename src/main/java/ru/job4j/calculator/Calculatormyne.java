package ru.job4j.calculator;

public class Calculatormyne {

    public static void plus(int first, int second) {
        int result = first + second;
        System.out.println(result);
    }

    public static void main(String[] args) {
        Calculatormyne.plus(100, 500);
        Calculatormyne.plus(4, 2);
        Calculatormyne.plus(3, 5);

    }

}

