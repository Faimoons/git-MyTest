package Home1Work.Vandih;

import java.util.Scanner;

class Homework4{
 public static void main(String[] args) { System.out.println("Введите число ");
  Scanner sc = new Scanner(System.in);
  int n = 3;
  for(int a = 2; a < n - 1; a++){
   if(Math.pow(a,n) % n == a % n){
    System.out.println("Простое число ");
    break;
   }
   else {
    System.out.println("Составное число ");
    break;
   }
  }}
}