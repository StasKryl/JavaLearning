package com.Krylov.Lesson3;

//)Одноклеточная амеба каждые 3 часа делится на 2 клетки.
// Определить,сколько амеб будет через 3, 6, 9, 12,..., 24 часа.
public class Lesn3ex2 {
    public static void main(String[] args) {
        int a;
        int b;
        for (a = 1; a <= 24; a++) {
            b = 2^(a/3);

            {
                System.out.println("Через" + a + "часов амеб будет " + b);
            }
        }

    }

}
