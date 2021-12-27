package samonova.lesson7;

public class Lesson7 {
    public static void main(String[] args) {
      /*  for (int i = 1; i <=10 ; i++) {
            System.out.println(i +" * 5 = " +(i*5) );

        }*/
        // таблица умножения ----------------------------------
       /* for (int i = 1; i <=10 ; i++) {
            for (int j = 1; j <=10 ; j++) {
                System.out.print(i*j + " " + '\t');

            }
            System.out.println();
        }*/

        // вывести число в обратном порядке --------------------------------------

        /*int i = 100;
        int k=0;
        while (i>0) {
            k=i%10;
            System.out.print(k);
            i=i/10;
        }*/

        // вывести мин и макс ------------------------

        /*int min = 9;
        int max = 0;
        int i = 4568;
        while (i > 0) {
            if (max < i % 10) {
                max = i % 10;
            }
            if (min > i % 10) {
                min=i%10;
            }
            i=i/10;
        }
        System.out.println(" макс " + max + ", мин " + min );*/

        // сумма чисел ----------------------------

  /* int i = 12355;
   int count=0;
   double sum =0;
   double result=0;
   int ost=0;
   while (i>0) {
      ost= i%10;
      count++;
       sum=sum+ost;
       i = i/10;
   }
   result=sum/count;
        System.out.println(result);*/

        // сумма чисел  -----------------------------------------------------
/*int sum=0;
        for (int i = 1; i <=5 ; i++) {
            sum=sum+i;
        }
        System.out.println(sum);*/

        // вывести звездочки в 5 строк и 8 столбцов --------------------------

       /* char ch = '*';
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(ch + " ");

            }
            System.out.println();*/

        // -лесенка ---------------------------------------------------

        for (int i = 1; i <=5 ; i++) {
            for (int j = i; j <=5 ; j++) {

                System.out.print("* ");


            }
            System.out.println();
        }
        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        }
    }

