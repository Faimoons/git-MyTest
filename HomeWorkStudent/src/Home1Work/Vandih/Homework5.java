package Home1Work.Vandih;

import java.util.Scanner;

class Homework5{
 public static void main(String[] args) { Scanner sc = new Scanner(System.in);
  int  kol = 0;
  for (int a = 0; a < 3; a++){
   for(int b = 0; b < 6; b++){
    for(int c = 0; c < 6; c++){
     for(int d = 0; d < 3; d++){
      if( a == 2 && (b == 4 || b == 5) && (c == 4 || c == 5) && d ==2 ){
       kol +=0;
      }
      else if  (b == c && a == d) {
       kol++;
      }
     }
    }
   }
  }
  System.out.println(kol);
 }}