package samonova.lesson11;

import java.util.Arrays;

public class F {
    public static void main(String[] args) {

/*      int [][] ar=new int  [5][5];
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(" " +1 + " ");

            }
            System.out.println();

        }
        for (int i = 0; i < 10; i++) {


int k = (int)(Math.random()*16+34) ;
        System.out.print(k + " ");}*/

       /* int [] arr = new int [10];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=i*3;

             if (i%2!=0){
                 arr[i]=0;

             }
            System.out.print(arr[i] + " ");*/

        //}

   /*     int [] [] ar = new int [5] [5];
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < 5-i; j++) {
                System.out.print("*");

            }
            System.out.println();

        }*/
        int [] ar = new int [100];
        for (int i = 0, j=0; i < ar.length; i=i+10, j++) {

                ar[i]=j;


            }
        System.out.println(Arrays.toString(ar));
        }

    }

