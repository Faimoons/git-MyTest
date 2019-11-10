package Home1Work.Podgainie;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите день месяца:  ");
        int day = 31;
        System.out.print("Введите месяц: ");
        int month = 12;
        System.out.print("Введите год: ");
        int year = 2016;

        if (day > 31) {
            System.out.println("Несуществующий день!");
        } else if (month > 12) {
            System.out.println("Несущестующий месяц! ");
        } else if (month == 2 && day > 29) {
            System.out.println("Несуществующий день!");
        } else if ((day == 28) && month == 2 && year % 4 != 0) {
            day = 1;
            month++;
            System.out.println("дата следующего дня: " + day+ " " + month + " " + year);
        } else if (day == 29 && month == 2 && year % 4 != 0) {
            System.out.println("Несуществующий день!");
        } else if (day == 29 && month == 2 && year % 4 == 0) {
            day = 1;
            month++;
            System.out.println("дата следующего дня: " + day+ " " + month + " " + year);
        } else if ((day == 31) && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10)) {
            day = 1;
            month++;
            System.out.println("дата следующего дня: " + day+ " " + month + " " + year);
        } else if ((day == 30) && (month == 4 || month == 6 || month == 9 || month == 11)) {
            day = 1;
            month++;
            System.out.println("дата следующего дня: " + day+ " " + month + " " + year);
        } else if ((day == 31) && month == 12) {
            day = 1;
            month = 1;
            year++;
            System.out.println("дата следующего дня: " + day+ " " + month + " " + year);
        } else {
            day++;
            System.out.println("дата следующего дня: " + day+ " " + month + " " + year);
        }
    }
}
