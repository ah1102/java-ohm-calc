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
        System.out.println();
        System.out.println("4. Выход");
        System.out.println("Введите цифру:");


        //Принимаем выбор от пользователя
        Scanner num = new Scanner(System.in);
        int vyb = num.nextInt(); //объявляем переменную и записываем в нее ввод пользователя

        float u, r, a;

        switch (vyb) {
            case 1: //расчет напряжения
                System.out.println("Введите сопротивление:");
                r = num.nextInt();
                System.out.println("Введите ток:");
                a = num.nextInt();
                u = r * a;
                System.out.println("Напряжение = " + u);
                break;
            case 2: //расчет сопротивления
                System.out.println("Введите напряжение:");
                u = num.nextInt();
                System.out.println("Введите ток:");
                a = num.nextInt();
                r = u / a;
                System.out.println("Сопротивление = " + r);
                break;
            case 3: //расчет тока
                System.out.println("Введите напряжение:");
                u = num.nextInt();
                System.out.println("Введите сопротивление:");
                r = num.nextInt();
                a = u / r;
                System.out.println("Сопротивление = " + a);
                break;
            default:
                System.out.println("Неправильный ввод!");
        }


    }
}
