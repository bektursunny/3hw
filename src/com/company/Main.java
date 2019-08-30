package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Всем привет!");
        String[] names = {"Jack", "John", "Ura"};
        for (int i = 0; i <3 ; i++) {
            System.out.println(i);

        switch (i) {
            case 0:
                System.out.println("Доброе утро!");
                break;
            case 1:
                System.out.println("Добрый день!");
                break;
            case 2:
                System.out.println("Добрый вечер!");
                break;

                default:
                    System.out.println("Иди спать!");


        }
        }


    }
}
