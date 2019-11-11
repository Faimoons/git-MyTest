package Home1Work.Vandih;

import java.util.Scanner;

class Homework1{
 public static void main(String[] args) { System.out.println("VVedite chisla");
  Scanner sc = new Scanner(System.in);
  double a = 6;
  double b = 6;
  double r = 5;
  double c = Math.sqrt(Math.pow(a, 2)+ Math.pow(b, 2));
  if(r >= c/2) {
   System.out.println("Картонка радиусом " + r + " закрывает полностью отверстие размера " + a + "*" + b);
  }
  else {
   System.out.println("Картонка радиусом " + r + " не закрывает полностью отверстие размера " + a + "*" + b);
  }}
}