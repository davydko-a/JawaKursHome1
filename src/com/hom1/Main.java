package com.hom1;

import java.util.Scanner;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args){
    One bum = new One(10, 'h');
    out.println("Первое задание: int = " + bum.getVal() + ", char = " + bum.getSim());

    //Второе задание
     Dog spoot  = new Dog("Spoot", "Ruff");
     Dog scruffy = new Dog("Scruffy", "Wurf");
     out.println("Второе задание: " + spoot.getName() + " says " + spoot.getSays() + ", " + scruffy.getName() + " says " + scruffy.getSays());

        //Третье задание
        out.print("Третье задание: Введите целое число:" );
        Scanner in = new Scanner(System.in);
        if (in.hasNextInt()) {
            int a = in.nextInt();
            int b = a % 2;
            if (b == 0) out.println("Вы ввели четное число");
            else out.println("Вы ввели не четное число");
        }
        else out.println("Вы ввели не целое число");

        //Четвертое задание
        out.print("Четвертое задание: Введите натуральное двузначное число:" );
        Scanner inTwo = new Scanner(System.in);
        String x = inTwo.nextLine();
        Integer y = Integer.parseInt(x);
        if (x.length() == 2) {
            int y1 = y / 10;
            int y2 = y%10;
            int z = y1 + y2;
            out.println("Сумма цифр двузначного числа:" + z);
        }
            else out.println("Вы ввели не двузначное число");

        //Пятое задание
        out.println("Пятое задание: Введите два числа:");
        out.print("Первое число:");
        Scanner inThird = new Scanner(System.in);
        if (inThird.hasNextDouble()) {
            double h = inThird.nextDouble();
            double p = 10 - h;
            out.print("Второе число:");
            Scanner inFourth = new Scanner(System.in);
            if (inFourth.hasNextDouble()) {
                double t = inFourth.nextDouble();
                double k = 10 - t;
                if (p < k)
                    out.println("Число " + h + " ближе к 10");
                else out.println("Число " + t + " ближе к 10");
            }
            else out.println("Вы ввели не число");
        }
        else out.println("Вы ввели не число");
    }
}
