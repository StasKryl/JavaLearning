package com.Krylov.Lesson3;
//Напишите программу печати таблицы перевода расстояний
// из дюймов в сантиметры для значений длин от 1 до 20 дюймов.
// 1 дюйм = 2,54 см

import java.util.Scanner;

public class Lesn3ex5 {
    public static void main(String[] args) {

        float c=2.54f;
        Scanner in = new Scanner(System.in);
        System.out.println(" Введите количество дюймов, для перевода их в сантиметры : ");
        int a = in.nextInt();
        float b = a * c;
            System.out.println(a + " дюймов = " + b + " сантиметров");
        }
    }

