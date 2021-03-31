package com.Krylov.Lesson3;
//Начав тренировки, спортсмен в первый день пробежал 10 км.
// Каждый день он увеличивал дневную норму на 10% нормы предыдущего дня.
// Какой суммарный путь пробежит спортсмен за 7 дней?
public class Lesn3ex1 {
    public static void main(String[] args) {
        int i = 10;
        float b = 0;
        for (i = 1; i <= 7; i++) ;
        b = b + (i + i * 0.1f);
        {
            System.out.println("пробежал спортсмен за день "+b+" км ");
        }
    }
}
