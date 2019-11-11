package Home1Work.Stejka;

public class Homework7 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        for(int i = 0; i<arr.length; i++){
            arr[i] = (int)(Math.random()*100);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(int i = 0; i<arr.length; i++){
            if((arr.length - 1 - i) > i) {
                int c = arr[i];
                arr[i] = arr[arr.length - 1 - i];
                arr[arr.length - 1 - i] = c;
            }
            System.out.print(arr[i] + " ");
        }


    }
}
