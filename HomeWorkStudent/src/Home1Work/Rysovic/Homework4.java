package Home1Work.Rysovic;
class Homework4{
 public static void main(String[] args) {boolean result = false;

  //Scanner sc = new Scanner(System.in);

  int number = 4;

  for (int i = 2; i<=number; i++) {
   if (number % i == 0 && i != number) {   //делится без остатка, но не на себя - Число составное
    result = false;
    break;
   }
   result = true;
  }
  System.out.println(number + (result ? " - является простым числом" : " - НЕ является простым числом"));
 }}
