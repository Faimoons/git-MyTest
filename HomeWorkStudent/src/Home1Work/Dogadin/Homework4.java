package Home1Work.Dogadin;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int num = 2;

        //имеет смысл проверять число только до его корня. Высчитываем предел проверки.
        int max = (int) Math.sqrt(num);
        boolean rez = true;
        double j;
        for (int i = 2; i <= max; i++) {
            j = (double) num / i;
            if ((double) j == (int) j) {
                rez = false;
                break;
            }
        }
        if (rez) {
            System.out.println("Число " + num + " является простым");
        } else {
            System.out.println("Число " + num + " не является простым");
        }
    }
}
