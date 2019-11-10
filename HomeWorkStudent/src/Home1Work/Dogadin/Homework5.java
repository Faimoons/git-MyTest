package Home1Work.Dogadin;

public class Homework5 {
    public static void main(String[] args) {
        int count = 0;
        int hz;
        for (int h=0;h<24;h++){
            //зеркально переворачиваем часы
            hz = (h % 10) * 10 + ((h/10) % 10);
            for (int m=0;m<60;m++){
                if (hz == m){
                    count++;
                }
            }
        }
        System.out.println("Количество равно " + count);

    }
}
