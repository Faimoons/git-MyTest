package Home1Work.Dogadin;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер a:");
        int a = in.nextInt();
        System.out.println("Введите размер b:");
        int b = in.nextInt();
        System.out.println("Введите радиус r:");
        int r = in.nextInt();

        //определям размер диагонали прямоугольника
        double d = Math.sqrt(a * a + b * b);
        //и сравниваем с двумя радиусами
        if (d > 2 * r) {
            System.out.println("Картонка с радиусом " + r + " не закрывает полностью отверстие размера " + a + "*" + b);
        } else {
            System.out.println("Картонка с радиусом " + r + " закрывает полностью отверстие размера " + a + "*" + b);
        }
    }
}
