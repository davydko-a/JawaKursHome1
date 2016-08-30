package com.hom1;

import java.util.Scanner;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args){
    One bum = new One(10, 'h');
    out.println("Первое задание: int = " + bum.getVal() + ", char = " + bum.getSim());

     Dog spoot  = new Dog("Spoot", "Ruff");
     Dog scruffy = new Dog("Scruffy", "Wurf");
     out.println("Второе задание: " + spoot.getName() + " says " + spoot.getSays() + ", " + scruffy.getName() + " says " + scruffy.getSays());

       /* out.print("Третье задание: Введите целое число:" );
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = a%2;
        if (b == 0) out.println("Вы ввели четное число");
            else out.println("Вы ввели не четное число");*/

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
    }
}
