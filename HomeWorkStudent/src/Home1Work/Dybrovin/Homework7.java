package Home1Work.Dybrovin;

public class Homework7 {
    public static void main(String[] args) {

        int n = 9;
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100) + 1;
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for(int i : viceVersa(array)) {
            System.out.print(i + " ");
        }
    }

    private static int[] viceVersa(int[] a) {
        int temp;
        for (int i = 0; i < a.length/2; i++) {
            temp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = temp;
        }
        return a;
    }
}
