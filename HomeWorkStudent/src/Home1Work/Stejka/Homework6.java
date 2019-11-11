package Home1Work.Stejka;
class Homework6{
 public static void main(String[] args) {
   int [] arr = new int[100];
   int max = 0;
   int min = 1000;
   int indMax = 0;
   int indMin = 0;

   for(int i = 0; i <arr.length; i++){
    arr[i] = (int)(Math.random()*1000);
   }

   for(int i = 0; i<arr.length; i++){
    if(arr[i]>max){
     max = arr[i];
     indMax = i;
    }
    if(arr[i]<min){
     min = arr[i];
     indMin = i;

    }
   }
   System.out.println("Максимальный элемент - " + max + ", минимальный элемент - " + min);
   System.out.println("Индекс максимального элемента - " + indMax + ", индекс минимального элемента - " + indMin);


 }
}