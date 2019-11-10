package Home1Work.Dogadin;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите дату в формате DD.MM.YYYY");
        String tmp = in.next();

        LocalDate date = LocalDate.parse(tmp, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        LocalDate date1 = date.plusDays(1);
        System.out.println("Следующая дата: " + date1.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));
    }
}
