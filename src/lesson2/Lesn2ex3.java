package com.Krylov.Lesson2;

import java.util.Scanner;

//Дано целое число. Если оно является положительным,
// то прибавить к нему 1.Если отрицательным, то вычесть из него 2.
// Если нулевым, то заменить его на 10. Вывести полученное число
public class Lesn2ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" Введите число: ");
        int a = in.nextInt();
        if (a > 0) {
            a++;
        } else if (a< 0) {
            a -= 2;
        } else if (a == 0)
            a = 10;{


            System.out.println(a);
            System.out.println(" Программка работает )");
        }

        }

    }

