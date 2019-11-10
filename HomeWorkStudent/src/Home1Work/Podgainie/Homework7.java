package Home1Work.Podgainie;

import java.util.Scanner;

public class Homework7 {
    public static void main(String[] args) {
        System.out.println("Укажите кол-во элементов массива:  ");
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        int a [] = new int [b];
        for ( int i = 0; i < a.length; i++ ) {
            a[i] = (int) (b * Math.random());
            System.out.print(a[i] + " ");
        }
        System.out.println();
        int n = a.length;
        for (int i = 0; i < n - i; i++ ) {
            int c = a[n - i - 1];
            a[n - i - 1] = a[i];
            a[i] = c;
        }
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }

    }
}
