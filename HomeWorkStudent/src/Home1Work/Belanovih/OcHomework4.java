package Home1Work.Belanovih;
class OcHomework4{
 public static void main(String[] args) {
   int n = 17;
   int[][] array = new int[n][n];

   fillsAnArray(array);
   printArray(array);
   System.out.println("Суммa всех элементов: " + countSumAll(array)); // иногда сумма всех элементов рандомно получается большая. Тогда среднеарифметическое выходит "NaN"
   System.out.println("Cреднее арифметическое всех элементов больше " + countSumAll(array) + ": " + returnAverage(array));// Поскольку в массиве нет элементов
   // больше суммы всех элементов
  }

  private static void fillsAnArray(int[][] someArray) {
   int support = someArray.length;
   for (int y = 0; y < someArray.length; y++) {
    for (int x = y + 1; x < support - 1; x++) {
     someArray[y][x] = (int) (Math.random() * 9 + 1);
    }
    if (y > 0 && y < support) {
     for (int x = 0; x < y; x++) {
      someArray[y][x] = (int) (Math.random() * (-9) - 1);
     }
     for (int x = someArray.length - 1; x >= someArray.length - y; x--) {
      someArray[y][x] = (int) (Math.random() * (-9) - 1);
     }
    } else if (y >= support) {
     for (int x = 0; x < support - 1; x++) {
      someArray[y][x] = (int) (Math.random() * (-9) - 1);
     }
     for (int x = someArray.length - 1; x > someArray.length - support; x--) {
      someArray[y][x] = (int) (Math.random() * (-9) - 1);
     }
     for (int x = support; x < someArray.length - support; x++) {
      someArray[y][x] = (int) (Math.random() * 9 + 1);
     }
    }
    support--;
   }
  }

  private static void printArray(int[][] someArray) {
   for (int[] ints : someArray) {
    for (int anInt : ints) {
     System.out.print(anInt + " ");
    }
    System.out.println();
   }
  }

  private static int countSumAll(int[][] someArray) {
   int sumAll = 0;
   for (int[] ints : someArray) {
    for (int anInt : ints) {
     sumAll = sumAll + anInt;
    }
   }
   return sumAll;
  }

  private static double returnAverage(int[][] someArray) {
   double moreThanSum = 0;
   double count = 0;
   for (int[] ints : someArray) {
    for (int anInt : ints) {
     if (anInt > countSumAll(someArray)) {
      moreThanSum = moreThanSum + anInt;
      count++;
     }
    }
   }
   return moreThanSum / count;
  }
}