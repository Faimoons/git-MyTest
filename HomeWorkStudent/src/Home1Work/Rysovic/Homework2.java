package Home1Work.Rysovic;
class Homework2{
 public static void main(String[] args) {//Scanner sc = new Scanner(System.in);
  int day = 31;
  int month = 12;
  int year = 2000;
  boolean lofty = true;
  int quantityDay;

  if (year % 4 != 0 || (year % 100 == 0 && year % 400 != 0))  //проверяем на высокосный год
   lofty = false;

  if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) //определяем количество дней в месяце
   quantityDay = 31;
  else if (month == 4 || month == 6 || month == 9 || month == 11)
   quantityDay = 30;
  else if (month == 2 && lofty)
   quantityDay = 29;
  else
   quantityDay = 28;

  day++;
  if (day > quantityDay) {  //добавляем 1 день и при необходимости меняем остальные значения
   day = 1;
   month++;
   if (month > 12) {
    month = 1;
    year++;
   }
  }
  System.out.println(day + " " + month + " " + year);}
}