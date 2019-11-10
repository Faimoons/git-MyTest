package Home1Work.Podgainie;

import java.util.Scanner;

public class Homework8 {
    public static void main(String[] args) {
        System.out.println("Введите текст: ");
        Scanner scanner= new Scanner(System.in);
        String textBefore = "ldkfgsp,asg?iairj!dfg,sfafg.dfg,;:";
        String textAfter = textBefore.replaceAll("[\\'\\\".,?!':;\\-_]", "");
        int d = textBefore.length() - textAfter.length();
        System.out.println("кол-во всех знаков препинания в тексте: " + d);
    }
}
