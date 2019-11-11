package Home1Work.Skacek;

import java.util.Scanner;

class Homework8{
 public static void main(String[] args) {
  Scanner input=new Scanner(System.in);
  System.out.println("Введите фразу");
  String a="askrgak,asg.ase?!,,..,fa,efae.aef:";

  punctual(a);


 }
 static void punctual(String arg){
  int b=arg.length(),d=0;
  char[] c=new char[b];
  char[] f=new char[b];
  c=arg.toCharArray();


  for (int i=0;i<b;i++){
   if (c[i] == ',' || c[i]=='.'||c[i]=='!'||c[i]=='?'||c[i]=='-'||c[i]==':'||c[i]==';') {
    d++;
    f[i]=c[i];
   }
  }//поиск знаков препинания и формирование массива знаков препинания
  char[] g=new char[d];
  d=0;
  for (int i=0;i<b;i++){
   if (f[i]!=0){
    g[d]=f[i];
    d++;
   }
  }//удаление пустых элементов массива знаков препинания
  if (d==0){
   System.out.println("В строке нет знаков препинания");
  }else {
   System.out.println("Все знаки препинания, встречающиеся в строке:");
   for (char i:g){
    System.out.print(i+" ");
   }
   System.out.println();
   System.out.println("Количество знаков препинания: "+d);
  }// вывод на экран знаков препинания
 }
}