package Home1Work.Vandih;

import java.util.Scanner;

class Homework7{
 public static void main(String[] args) {System.out.println("Введите размер массива ");
  Scanner sc = new Scanner(System.in);
  int n = 0;
  n = 4;
  int[] mas = new int[n];
  for (int i = 0; i < mas.length; i++) {
   mas[i] = (int) (Math.random() * 1000 - 250);
   System.out.print(mas[i] + " ");
  }
  System.out.println();
  for (int j = mas.length - 1; j >= 0; j--) {
   System.out.print(mas[j] + " ");
  }
 }
}