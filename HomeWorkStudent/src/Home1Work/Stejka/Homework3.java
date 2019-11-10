package Home1Work.Stejka;

public class Homework3 {
    public static void main(String[] args) {
        int s = (int)(Math.random()*28800);
        int h = s/3600;
        System.out.println(s);

        if(s==0){
            System.out.println("Рабочий день закончился");
        }
        else if (h==1){
            System.out.println("Остался 1 час");
        }
        else if (h==2 || h == 3 || h==4){
            System.out.println("Осталось " + h + " часа");
        }
        else{
            System.out.println("Осталось " + h + " часов");
        }

    }
}
