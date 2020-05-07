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

        float u, r, a;

        switch (num.nextInt()) {
            case 1: //расчет напряжения
                System.out.println("Введите сопротивление:");
                r = num.nextInt();
                System.out.println("Введите ток:");
                a = num.nextInt();
                System.out.println("Напряжение = " + (r * a));
                break;
            case 2: //расчет сопротивления
                System.out.println("Введите напряжение:");
                u = num.nextInt();
                System.out.println("Введите ток:");
                a = num.nextInt();
                System.out.println("Сопротивление = " + (u / a));
                break;
            case 3: //расчет тока
                System.out.println("Введите напряжение:");
                u = num.nextInt();
                System.out.println("Введите сопротивление:");
                r = num.nextInt();
                System.out.println("Сопротивление = " + (u / r));
                break;
            default:
                System.out.println("Неправильный ввод!");
        }
        System.out.println("Повторить?: y/n");

        char yas = 'y';
        char ext = num.next().charAt(0);
        if (ext == yas) {
            System.out.println("Сработало");
        }


    }
}
