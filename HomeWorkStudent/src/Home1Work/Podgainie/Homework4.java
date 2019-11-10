package Home1Work.Podgainie;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        System.out.print("Введите число ");
        Scanner scanner = new Scanner(System.in);
        int b = 2;
        int i;
        boolean f = true;
        for (i = 2; i < (b/2); i++) {
            if (b%i == 0) {
                f = false;
                break;
            }
        }
        if (f) {System.out.println("Число " + b + " простое");
        } else System.out.println("Число " + b + " составное");
    }
}
