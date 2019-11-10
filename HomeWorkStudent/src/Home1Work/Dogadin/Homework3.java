package Home1Work.Dogadin;

import java.time.LocalTime;

public class Homework3 {public static void main(String[] args) {
    String[] nameHour = {"час", "часа", "часов"};
    String[] namePref = {"остался", "осталось", "осталось"};
    int fullHour;

    int n = (int) (Math.random() * 28800);
    LocalTime localTime = LocalTime.ofSecondOfDay(n);
    fullHour = localTime.getHour();

    System.out.println(n);
    if (n == 0) {
        System.out.println("рабочий день закончился");
    } else if (n < 60 * 60) {
        System.out.println(namePref[1] + " менее " + nameHour[1]);
    } else {
        System.out.println(getString(fullHour, namePref) + " " + fullHour + " " + getString(fullHour, nameHour));
    }
}

    static String getString(int amount, String[] timeArray) {
        switch (amount % 100) {
            case 11:
            case 12:
            case 13:
            case 14:
                return (timeArray[2]);
            default:
                switch (amount % 10) {
                    case 1:
                        return (timeArray[0]);
                    case 2:
                    case 3:
                    case 4:
                        return (timeArray[1]);
                    default:
                        return (timeArray[2]);
                }
        }
    }
}
