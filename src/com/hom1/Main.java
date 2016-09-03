package com.hom1;

import java.util.Scanner;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
        One bum = new One(10, 'h');
        out.println("Первое задание: int = " + bum.getVal() + ", char = " + bum.getSim());

        //Второе задание
        Dog spoot = new Dog("Spoot", "Ruff");
        Dog scruffy = new Dog("Scruffy", "Wurf");
        out.println("Второе задание: " + spoot.getName() + " says " + spoot.getSays() + ", " + scruffy.getName() + " says " + scruffy.getSays());

        //Третье задание
        out.print("Третье задание: Введите целое число:");
        Scanner in = new Scanner(System.in);
        if (in.hasNextInt()) {
            int a = in.nextInt();
            int b = a % 2;
            if (b == 0) out.println("Вы ввели четное число");
            else out.println("Вы ввели не четное число");
        } else out.println("Вы ввели не целое число");

        //Четвертое задание
        out.print("Четвертое задание: Введите натуральное двузначное число:");
        Scanner inTwo = new Scanner(System.in);
        String x = inTwo.nextLine();
        Integer y = Integer.parseInt(x);
        if (x.length() == 2) {
            int y1 = y / 10;
            int y2 = y % 10;
            int z = y1 + y2;
            out.println("Сумма цифр двузначного числа:" + z);
        } else out.println("Вы ввели не двузначное число");

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
            } else out.println("Вы ввели не число");
        } else out.println("Вы ввели не число");

        //Шестое задание
        out.println("Шестое задание: Введите положительные длины катетов прямоуголоного треугольника. Катет а = :");
        Scanner inSixth = new Scanner(System.in);
        if (inSixth.hasNextDouble()) {
            double q = inSixth.nextDouble();
            if (q > 0) {
                out.println("Второй катет b = :");
                Scanner inSeventh = new Scanner(System.in);
                if (inSeventh.hasNextDouble()) {
                    double u = inSeventh.nextDouble();
                    if (u > 0) {
                        double i = 0.5 * q * u;
                        double c = Math.sqrt(q + u);
                        double o = q + u + c;
                        out.println("Площадь треугольника = : " + i);
                        out.println("Периметр треугольника = : " + o);
                    }
                    else out.println("Введите положительное значение.");
                }
                else out.println("Введите число.");
            }
            else out.println("Введите положительное значение.");
        }
        else out.println("Введите число.");

        //Седьмое задание
        out.print("Седьмое задание: Введите корни квадратного уравнения: а = :");
        Scanner inEighth = new Scanner(System.in);
        if (inEighth.hasNextDouble()) {
            double j = inEighth.nextDouble();
            out.print("b = :");
            Scanner inNinth = new Scanner(System.in);
            if (inNinth.hasNextDouble()) {
                double n = inNinth.nextDouble();
                out.print("c = :");
                Scanner inTenth = new Scanner(System.in);
                if (inTenth.hasNextDouble()) {
                    double m = inTenth.nextDouble();
                    double d = Math.pow(n, 2) - (4 * j * m);
                    if (d < 0)
                        out.println("Уровнение не имеет корней");
                        else if (d == 0) {
                            double x1 = (- n + Math.sqrt(d)) / (2 * j);
                            out.println("Уровнение имеет один корень: x1 = " + x1);
                        }
                        else if (d > 0) {
                            double x1 = (- n + Math.sqrt(d)) / (2 * j);
                            double x2 = (- n - Math.sqrt(d)) / (2 * j);
                            out.println("Уровнение имеет два корня: x1 = " + x1 + "; x2 = " + x2);
                    }
                }
                else out.println("Введите число.");
            }
            else out.println("Введите число.");
        }
        else out.println("Введите число.");
    }
}
