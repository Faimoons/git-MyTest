package Home1Work.Biakov;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите длину и ширину прямоугольника");
        int a = 6;
        int b = 6;
        System.out.println("введите радиус круга");
        int r = 4;
        double d = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        if ((r*2) >= d) System.out.printf("картонка радиусом %d закрывает полностью отверстие %d * %d", r, a, b);
        else System.out.printf("картонка радиусом %d не закрывает полностью отверстие %d * %d", r, a, b);
    }
}
