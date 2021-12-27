package samonova.lesson12;

import java.util.Arrays;

public class Lesson12 {
    public static void main(String[] args) {
/*int [] ar = new int [10];
        for (int i = 0; i < ar.length; i++) {
         ar[i] = (int)(Math.random()*20+40 ) ;
        }
        System.out.println(Arrays.toString(ar));*

      /
 */

       /* int [] ar = new int [15];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = i*3 ;
            if (i%2!=0){
                ar[i] =0;

            }
            System.out.print(ar[i] + " ");
        }*/


      /*  int[] ar = {5, 88, -17, 22, 33};
        int min = ar[0];
        int max = ar[0];
        int min1 = 0;
        int max1 = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > max) {
                max = ar[i];
                max1 = i;
            }
            if (ar[i] < min) {
                min = ar[i];
                min1 = i;
            }

        }
        System.out.println("min " + min1);
        System.out.println("max " + max1);*/


        /*int [] ar = {2,6,7,8,5,6,404,88,55,22};
        Arrays.sort(ar);
        System.out.println(Arrays.toString(ar));*/



        //Сделать пузырьковую
      /*  int [] ar = {2,66,7,8,5,6,404,88,55,22};
        int k;

        for (int i = 0; i < ar.length; i++) {
            for (int j =i+1 ; j >ar.length; j++) {
                if (ar[i]>=ar[j]){
                    k=ar[j];
                    ar[j]=ar[i];
                    ar[i]=k;
                }


            }



            }
        System.out.println(Arrays.toString(ar));*/

       /* int ar [] [] = new int [5][10];
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length; j++) {
                ar[i][j]=(int)(Math.random()*15+20);

            }


        }

        System.out.println(ar.length);
        System.out.println(ar[2].length);
        System.out.println();
        System.out.print(Arrays.deepToString(ar));
        }*/

        /*int [] ar = new int [10];
        for (int i = 0; i < ar.length; i++) {
            ar[i]=i+3;
            System.out.print(ar[i] + " ");
        }
        System.out.println();
            for (int j = ar.length-1; j > 0; j--) {

                System.out.print(ar [j]  + " ");
*/
          //  }
      /*  int kount =0;
        int count = 0;
        int [] ar = { 1,2,3,4,5,6,7,8,9,10,11};
        System.out.println(Arrays.toString(ar));
        for (int i = 0; i < ar.length; i++) {
            if (ar[i]%2==0){

                count++;

            }
            else {

                kount++;

            }

        }System.out.println( count);
        System.out.println(kount);*/

        int [] ar1 = new int [10];
        int [ ] ar2 = new int [15];
        for (int i = 0; i < ar1.length; i++) {
            ar1[i]= (int)(Math.random()*10);
        }
        for (int i = 0; i < ar1.length; i++) {
        ar2[i]= (int)(Math.random()*10);
        }
        System.out.println(Arrays.toString(ar1));
        System.out.println(Arrays.toString(ar2));

        double sum1=0;
        double sum2=0;
        int count1=0;
        int count2=0;
        double res1 =0;
        double res2 =0;

        for (int i = 0; i <ar1.length ; i++) {
            sum1=sum1+ar1[i];
            count1++;

        }
        res1=sum1/count1;
        System.out.println(res1);

        for (int i = 0; i <ar1.length ; i++) {
            sum2=sum2+ar2[i];
            count2++;

        }
        res2=sum2/count2;
        System.out.println(res2);

        if (res1>res2) {
            System.out.println("результат 1 больше ");

        }
        else {
            System.out.println("результат 2 больше ");
        }




    }}

