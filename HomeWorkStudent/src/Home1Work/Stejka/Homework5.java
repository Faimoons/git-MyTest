package Home1Work.Stejka;

public class Homework5 {
    public static void main(String[] args) {

        int b = 0;

        for(int h1=0; h1<3; h1++){
            for(int h2 = 0; h2<10; h2++ ) {
                for (int m1 = 0; m1 < 6; m1++) {
                    for (int m2 = 0; m2 < 10; m2++) {
                        if (m2 == h1 && m1 == h2) {
                            if((h1==2 && h2<4) || h1<2) {
                                b++;
                                System.out.println(h1 + "" + h2 + ":" + m1 + "" + m2);
                            }
                        }
                    }
                }
            }
        }
        System.out.println(b);
    }
}
