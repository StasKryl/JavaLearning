package com.Krylov.Lesson2;

import java.util.Scanner;

// Даны 3 целых числа. Найти количество положительных и отрицательных чисел в исходном наборе.
public class Lesn2ex4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println(" Ввведите число a:  ");
        int a = in.nextInt();

        System.out.println(" Введите число b:  ");
        int b = in.nextInt();

        System.out.println("Введите число с:  ");
        int c = in.nextInt();
        if (a > 0 & b < 0 & c < 0) {
            System.out.println(" Вы ввели одно положительное и два отрицательных числа");
        } else if (a > 0 & b > 0 & c < 0) {
            System.out.println(" Вы ввели два положительных и одно отрицательное число");
        } else if (a > 0 & b > 0 & c > 0) {
            System.out.println("Вы ввели все положительные числа");
        } else {
            System.out.println("Вы ввели все отрицательные числа");
        }
        //  дайте пожалуйста комментарии. Программа не работает.
    }

}
