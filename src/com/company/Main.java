package com.company;

public class Main {

    public static void main(String[] args) {
        // задание 1
        int start = 1;
        while (start > 0 && start < 11) {
            System.out.print(start);
            start++;
        }
        System.out.println("");
        for (int i=10; i>0; i=i-1) {
            System.out.print(i);
        }
        System.out.println("");
       // задание 2
        for (int friday=1;friday<=31; friday=friday+7) {
            System.out.println("Сегодня пятница," + friday + "-е число. Необходимо подготовить отчет");
        }
        // Задание 3
        int cometa = 0;
        for (cometa=1896;cometa<2100; cometa=cometa+79) {
            System.out.println(cometa);
        }
        }
    }