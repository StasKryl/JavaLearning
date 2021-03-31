package com.Krylov.Lesson2;
//Даны 2 числа. Вывести большее из них

import java.util.Scanner;

public class Lesn2ex6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" Ввведите первое значение  ");
        int a = in.nextInt();
        System.out.println(" Введите второе значение  ");
        int b = in.nextInt();

        if (a > b) {
            System.out.println(a + " Найбольшее число");
        } else {
            System.out.println(b + " Найбольшее число");
            System.out.println(" Программка работает ) ");
        }

    }
}

