package Home1Work.Strelcenok;
class Homework1{
 public static void main(String[] args) {//Scanner scanner = new Scanner(System.in);
  System.out.println("Введите a :");
  int a = 6;
  System.out.println("Введите b :");
  int b = 6;
  System.out.println("Введите r :");
  int t;
  int r = 6;
  t = r * 2;
  int q = t * t;

  if (a * a + b * b <= q) {
   System.out.println("Картонка с радиусом " + r + " закрывает полностью отверстие " + a + " * " + b);
  } else {
   System.out.println("Картонка с радиусом " + r + " не закрывает полностью отверстие " + a + " * " + b);
  }}
}