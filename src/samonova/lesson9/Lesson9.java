package samonova.lesson9;

import java.util.Arrays;

public class Lesson9 {
    public static void main(String[] args) {
        /*int[] array = new int[10];
        array [0] = 5;
        array [1] = 5;
        array [3] = 5;
        array [4] = 5;
        array [5] = 5;
        System.out.println(Arrays.toString(array));*/


    /*int [] mas = {1, 2};
        System.out.println(mas.length);*/

         /*int [] ar = new int [10];
         for (int i=0; i<ar.length; i++) {
             ar [i]=i;
             System.out.println(Arrays.toString(ar));
         }*/
        /*String [] people = new String[10];
        people [0]="Petrov Ivan";
        people [1]="Ivanov Kvan";
        people [7]=" fedya";
        String fedya = people[7];
        System.out.println(fedya);

        System.out.println(people[7]);*/

        /*int [] number = {2,4,6,8,1,33,555};
        Arrays.sort(number);
        System.out.println(Arrays.toString(number));*/

        /*int[] arr = new int [100];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=i;

        }
        System.out.println(Arrays.toString(arr));*/

       /* int [] arr= new int [20];
        System.out.println(arr.length);
        arr [1] =5;
        arr [5]=6;
        arr [7]=33;
        arr [10]=22;
        arr [19]=638;
        System.out.println(Arrays.toString(arr));
*/
//        int[] arr ={1,2,3,4,5};
//        System.out.println(Arrays.toString(arr));

        /*int [] ar = {100,-3,5,6,7,66,88,2, 55, 9};
        int max = ar [0];
        int min = ar [0];
        for (int numb: ar) {
            if (numb> max)
                max= numb;

        if (numb<min)
        min = numb;}
        System.out.println(max);
        System.out.println(min);*/

        /*int[] arr = new int [100];
        arr [9] = 1;
        arr [19] =2;
        System.out.println(Arrays.toString(arr));*/

        int[] arr = new int [100];
        for (int i = 9, j =0; i <arr.length ; i=i+10, j++)
        {
            arr[i]=j+1;


        }
        System.out.println(Arrays.toString(arr));
    }
}

