package com.Krylov.Lesson2;

import java.util.Scanner;
// Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей.
// Определить существует ли такой треугольник.
// Дано: a, b, c –стороны предполагаемого треугольника.
// Требуется сравнить длину каждого отрезка-стороны с суммой двух других.
// Если хотя бы в одном случае отрезок окажется больше суммы двух других, то треугольника с такими сторонами не существует.
public class Lesn2Ex2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println(" Ввведите значение стороны a:  ");
        int a = in.nextInt();

        System.out.println(" Введите значение стороны b:  ");
        int b = in.nextInt();

        System.out.println("Введите значание стороны с:  ");
        int c = in.nextInt();
        if ((a + b) > c && (b + c) > a && (a + c) > b) {
            System.out.println(" Такой треугольник существует");
        } else {
            System.out.println(" Такой треугольник не существует");
        }
    }

}
