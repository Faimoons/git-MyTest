package Home1Work.Podgainie;

import java.util.Random;

public class Homework3 {
    public static void main(String[] args) {
        int [] timeSec = new int [28801];
//        for (int i = 0; i <timeSec.length; i++){
//            timeSec[i] = i;
//        }
        int n = new Random().nextInt(timeSec.length);
        System.out.println(n);
        int b = 3600;
        switch (n/b) {
            case 8:
            case 7:
            case 6:
            case 5:
                System.out.println("Осталось " + n/b + " часов");
                break;
            case 4:
            case 3:
            case 2:
                System.out.println("Осталось " + n/b + " часа");
                break;
            case 1:
                System.out.println("Остался 1 час");
            case 0:
                if (n!=0) System.out.println("Осталось менее часа");
                if (n==0) System.out.println("Рабочий день закончился!");
                break;
        }
    }
}
