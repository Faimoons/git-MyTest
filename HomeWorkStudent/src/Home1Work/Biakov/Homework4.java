package Home1Work.Biakov;

public class Homework4 {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        System.out.println("введите число");
        long n = 2;
        if (n <=1){
            System.out.printf("число %d - не простое, не составное", n);
        }
        else if (n % 2 == 0){
            System.out.printf("число %d - составное", n);
        }
        else {
            double root = Math.sqrt(n);
            if (root == (int)root) {
                System.out.printf("число %d - составное", n);
            }
            else {
                boolean simple = true;
                for (int i = 3; i <= root; i += 2)
                    if (n % i == 0) {
                        simple = false;
                        break;
                    }
                if(simple) System.out.printf("число %d - простое", n);
                else System.out.printf("число %d - составное", n);
            }
        }
    }
}
