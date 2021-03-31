package com.Krylov.Lesson2;
// В переменную записываете количество программистов.
// В зависимости от количества программистов необходимо вывести правильно окончание.
// Например: • 2 программиста • 1 программиста • 10 программистов • и т.д.
import java.util.Scanner;

public class Lesn2ex7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" Введите число программистов");
        int num = in.nextInt();
        if (num > 0 & num < 2)
        {
            System.out.println(num + " программист");
        }else if(num >= 2 & num < 5)
        {
            System.out.println(num + " программиста");
        }else if(num >= 5 & num < 21)
        {
            System.out.println(num + " программистов");
            // интересно, а какими методами здесь можно применить ООП. Инкапсуляцию и наследование.
            //  Необходимо в теле программы создать классы с private-public?
       // дайте пожалуйста комментарии, почему выскакивает ошибка else without if
        }
    }
}
