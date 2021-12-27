package samonova.lesson11;

import java.util.Arrays;

public class Lesson11 {
    public static void main(String[] args) {
       /* for (int i = 0; i < 10; i++) {
            double k =    Math.random();
            System.out.println(k);
        }*/


        //(Math.random()*(b-a))+a;
        // от0 до 3
// нижняя 0*3=0
        //верхня  1*3=3
       // double d = Math.random() * 3; // от 0 до 3
       // System.out.println(d);
        //(Math.random()*(3-0))+0;


        // [2;3)
       // double d= Math.random() +2;
        //System.out.println(d);
        // нижняя 0+2=2 верхняя 1+2=3
        //(Math.random()*(3-2))+2; --> Math.random()*1 +2;



        //[20;60)
        //нижняя 0*40=0
        //верхняя 1*40=40
             //(Math.random()*(60-20))+20;
       // double d = Math.random()*20+80 ;
       // System.out.println(d);



        //[-100;100)
       // double d = Math.random()*200-100;



        //[18;30)
      //  double d = Math.random()*12+18;



        //[15;64)
        //double d = Math.random()*49+15;

       // int i = (int) (Math.random()*3);


        //Заполняем массив случайными числами
       /* *//*int  [] ar = new int [15];
        for (int i = 0; i < ar.length; i++) {
            ar[i]=(int) (Math.random()*20-3);
            System.out.println(ar[i]);*//*


       }*/


        /*int [] ar= new int [100];
        for (int i = 0; i < ar.length; i++) {
            ar[i]=i+1;
        }
        System.out.println(Arrays.toString(ar));*/

       /* int [] ar = new int [20];
        for (int i = 0; i < ar.length; i++) {
            ar[i]=i*4;
            if( ar[i] %2==0) {
                System.out.print(ar[i] + " ");
            }*/

int [] ar = {5,58,88,6,7,-77,4};
        System.out.println(Arrays.toString(ar));
int min =ar[0];
int max = ar[0];
int min1 =0;
int max1=0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i]>max) {
                max=ar[i];
            max1=i;}
            if (ar[i]<min){
                min=ar[i];
            min1=i;
        }}
        System.out.println("min " + min +" max " + max );
        int k= ar[min1];
        ar[min1]=ar[max1];
        ar[max1]=k;
        System.out.println(Arrays.toString(ar));





  /*      int [][] ar = new int [5][5];
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("*" + " ");


            }
            System.out.println();

        }

        int d = (int) ((Math.random()*16) +34);
        System.out.println(d);*/

        /*int [] ar = new int [10];
        for (int i = 0; i < ar.length; i++) {
            ar[i]=i+3;
            if (i%2!=0) {
                ar[i]=0;

            }
            System.out.print(ar[i] + " ");
        }*/

    /*    int [][] ar = new int [5][5];
        for (int i = 0; i < ar.length; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print("*" + " ");

            }
            System.out.println();*/

       // }

     /*   for (int i = 0; i < 10; i++) {
            double k=((Math.random()*40)-20);
            System.out.println( k);
        }*/

    }}
