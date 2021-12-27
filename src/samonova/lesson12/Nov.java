package samonova.lesson12;

import java.util.Arrays;

public class Nov {
    public static void main(String[] args) {
        // я сама прогоняю урок
/* int [ ] ar = new int [10];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = (int) (Math.random() *20);
            if (i%2!=0) {
                ar[i]=0;
            }

        }
        System.out.println(Arrays.toString(ar));*/

 /*       int [] ar = {7, -2, 9 , 45, 0, 4};
        int min = ar[0];
        int max = ar [0];
        int min1=0;
        int max1=0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i]<min){
                min=ar[i];
                min1=i;
            }
            if (ar[i]>max) {
                max=ar[i];
                max1=i;
            }
            System.out.println(Arrays.toString(ar));
            System.out.println("позиция минимального " + min1);
            System.out.println("позиция максимального " + max1);
        }*/

      /*  int [] ar = {7, -2, 9 , 45, 0, 4};
        System.out.println("исходный");
        System.out.println(Arrays.toString(ar));
        boolean isSort = true;

        while (isSort) {
            isSort = false;


            for (int i = 0; i < ar.length - 1; i++) {
                if (ar[i] > ar[i + 1]) {
                    int k = ar[i];
                    ar[i] = ar[i + 1];
                    ar[i + 1] = k;
                    isSort = true;
                }

            }
        }

        System.out.println("отсортированный");
        System.out.println(Arrays.toString(ar));*/


        /*int [] [] ar = new int [5][10];
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length; j++) {
                ar[i][j] = (int)(Math.random()*50);

            }

        }
        System.out.println(Arrays.deepToString(ar));
        System.out.println(ar.length + " строк ");
        System.out.println(ar[1].length + " стообцов ");*/


     /*   int[] ar = new int[10];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = (int) (Math.random() * 20);
            System.out.print(ar[i]+" ");

        }
        System.out.println();
        for (int i =ar.length-1; i >=0; i--) {
            System.out.print(ar[i]+ " ");
        }*/

/*        int [] ar ={10, 20 , 30 , 40 , 50, 7 , 9 ,11, 15, 60, 70,1, 0};
        System.out.println(Arrays.toString(ar));

        int countChet = 0;
        int countNech = 0;

        for (int j : ar) {
            if (j % 2 == 0) {
                countChet++;


            }

            else {
                countNech++;

            }


        }
        System.out.println(countChet);
        System.out.println(countNech);*/

    /*    int [] ar1 = {1, 2 , 3 , 4 , 5 , 6};
        int [] ar2 = {10, 20 , 30 , 40 , 50 , 60, 100};
        int count1 = 0;
        int count2 = 0;
        double sum1 = 0;
        double sum2 = 0;
        double res1 =0;
        double res2 =0;

        for (int i : ar1) {
            sum1=sum1+i;


        }
        for (int i : ar2) {
            sum2=sum2+i;


        }

        res1 = sum1/ar1.length;
        res2 = sum2/ar2.length;

        System.out.println(res1);
        System.out.println(res2);

        if (res1>res2){
            System.out.println(" первое больше второго ");
        }
        else if (res1<res2) {
            System.out.println(" второе больше первого ");

        }
        else System.out.println(" они равны ");*/

        int [] ar = {1, 9 , 88 , -66 , 58 , 11 ,33 ,0};
        System.out.println(Arrays.toString(ar));

        boolean isMas = true;
        while (isMas){
            isMas = false;

        for (int i = 0; i < ar.length-1; i++) {
            if (ar[i]>ar[i+1]) {
                int k = ar[i];
                ar[i] = ar[i+1];
                ar[i+1] = k;
                isMas = true;
            }

        }

        }
        System.out.print( Arrays.toString(ar));

    }
}
