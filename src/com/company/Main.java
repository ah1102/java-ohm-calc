package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Рассчет закона Ома");
        System.out.println("\n");
        System.out.println("Что рассчитываем?");
        System.out.println("1. Напряжение");
        System.out.println("2. Сопротивление");
        System.out.println("3. Ток");
        System.out.println("Введите цифру:");

        //Принимаем выбор от пользователя
        Scanner num = new Scanner(System.in);
        int vyb = num.nextInt(); //объявляем переменную и записываем в нее ввод пользователя

        float u, r, a;

        switch (vyb) {
            case 1: //расчет напряжения
                System.out.println("Введите сопротивление:");
                Scanner num2 = new Scanner(System.in);
                r = num2.nextInt();
                System.out.println("Введите ток:");
                Scanner num3 = new Scanner(System.in);
                a = num3.nextInt();
                u = r * a;
                System.out.println("Напряжение = " + u);
                break;
            case 2: //расчет сопротивления
                System.out.println("Введите напряжение:");
                Scanner num4 = new Scanner(System.in);
                u = num4.nextInt();
                System.out.println("Введите ток:");
                Scanner num5 = new Scanner(System.in);
                a = num5.nextInt();
                r = u / a;
                System.out.println("Сопротивление = " + r);
                break;
            case 3: //расчет тока
                System.out.println("Введите напряжение:");
                Scanner num6 = new Scanner(System.in);
                u = num6.nextInt();
                System.out.println("Введите сопротивление:");
                Scanner num7 = new Scanner(System.in);
                r = num7.nextInt();
                a = u / r;
                System.out.println("Сопротивление = " + a);
                break;
            default:
                System.out.println("Неправильный ввод!");
        }
    }
}
