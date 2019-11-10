package Home1Work.Stejka;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int a = 4;
        boolean b = false;

        for(int i = 2; i<a; i++){
            if(a%i==0){
                b = true;
            }
        }

        if(b){
            System.out.println("Число составное" );
        }
        else if (a == 1 || a == 0){
            System.out.println("Число не простое и не составное");
        }
        else{
            System.out.println("Число простое");
        }
    }
}
