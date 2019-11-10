package Home1Work.Podgainie;

public class Homework5 {
    public static void main(String[] args) {
        int h1 = 0;
        int h2 = 0;
        int m1 = 0;
        int m2 = 0;
        int count = 0;
        for (h1 = 0; h1 < 2; h1++) {
            for (h2 = 0; h2 < 6; h2++) {
                for (m1 = 0; m1 < 6; m1++) {
                    for (m2 = 0; m2 < 3; m2++) {
                        if (h1 == m2 && h2 == m1) count++;
                    }
                }
            }
        }
        for (h1 = 2; h1 < 3; h1++) {
            for (h2 = 0; h2 < 4; h2++) {
                for (m1 = 0; m1 < 6; m1++) {
                    for (m2 = 0; m2 < 3; m2++) {
                        if (h1 == m2 && h2 == m1) count++;
                    }
                }
            }
        }
        System.out.println("Количество симметричных комбинацйия " + count);
    }
}
