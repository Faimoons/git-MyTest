package Home1Work.Vandih;
class Homework2{
 public static void main(String[] args) {System.out.println("VVedite chisla");
  //Scanner sc = new Scanner(System.in);
  int day = 28;
  int mon = 2;
  int year = 2006;
  int d = 0, m = 0, y = 0;
  if( year % 4 == 0 && mon == 2 && day == 29 ){
   d = 1;
   m = 3 ;
   y = year;
   System.out.println(d + " " + m + " " + y);
  }
  else  if ( day == 28 && mon == 2) {
   d = day + 1;
   m = mon;
   y = year;
   System.out.println(d + " " + m + " " + y);
  }
  else if (day == 30 && mon == 9){
   d = 1;
   m = 10;
   y = year;
   System.out.println(d + " " + m + " " + y);
  }

  else  if (day < 31) {
   d = day + 1;
   m = mon;
   y = year;
   System.out.println(d + " " + m + " " + y);
  }
  else if (day >= 31 && mon < 12 ) {
   d = 1;
   m = mon + 1;
   y = year;
   System.out.println(d + " " + m + " " + y);

  } else {
   d = 1;
   m = 1;
   y = year + 1;
   System.out.println(d + " " + m + " " + y);
  }}
}