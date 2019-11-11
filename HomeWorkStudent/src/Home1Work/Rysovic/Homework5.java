package Home1Work.Rysovic;
class Homework5{
 public static void main(String[] args) {byte count = 0;
  int hour[][] = new int[24][2];
  int minute[][] = new int[60][2];

  for (int i = 0; i < 24; i++) {     //заполняем масив "часы"
   int j = 0;
   hour[i][j] = i / 10;
   hour[i][j+1] = i % 10;
  }

  for (int i = 0; i < 60; i++) {        //заполняем масив "минуты"
   int j = 0;
   minute[i][j] = i / 10;
   minute[i][j+1] = i % 10;
  }

  for (int i = 0; i<hour.length; i++) {       //выводим симметричные числа на часах
   for (int j = 0; j<minute.length; j++) {
    int x = 0;
    if (hour [i][x] == minute[j][x+1] && hour[i][x+1] == minute[j][x]) {
     count +=1;
     break;      //если нашли симметрию то выходим из вложенного цикла для экономии времени
    }
   }
  }
  System.out.print(count);}
}