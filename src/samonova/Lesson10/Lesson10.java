package samonova.Lesson10;

public class Lesson10 {
    public static void main(String[] args) {
/*int [] mas =  {10,20,30,40};
int pos1= Arrays.binarySearch(mas, 30);
        System.out.println(pos1);
        int pos2=Arrays.binarySearch(mas,105);
        System.out.println(pos2);*/

        /*int [] mas = {1,2,3,4,5,6,7,8,9};
        int [] arr = {0,0,0,0,0,0,0,0,0};

        System.out.println(Arrays.toString(mas));
        System.out.println(Arrays.toString(arr));

        System.arraycopy(mas,2,arr,3,5);
        System.out.println(Arrays.toString(arr));*/

        int [][] array = new int [5][7];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                count++;
                System.out.print(count + " ");

            }
            System.out.println();
        }
       /* String[][] mas ={{"one" , "two ", "three"},{"four", " five", "six"}};
        System.out.println(Arrays.deepToString(mas));*/

        //  int [][ ] mas1 = {{1,2,3}, {4,5,6}, {7,8,9}};
        //  System.out.println(Arrays.deepToString(mas1));

       /* int[][] array = new int[5][];
        array[0]=new int [] {1,2,3,4};
        array[1]=new int [] {1,2};
        array[2]=new int [] {1,2,3,4,5,6};
        array[3]=new int [] {111221,24242,3424,447777};
        array[4] = new int[] {12, 33,555};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array [i][j]=1;
                System.out.print(array[i][j] + " "+'\t');

            }
            System.out.println();*/

        // }



/*        int [] [] ar = new int [5][5];
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < i+1; j++) {

                System.out.print("*" + " ");

            }
            System.out.println();

        }*/


     /* int [] ar = new int [20];
        for (int i = 0; i < ar.length; i++) {
            ar[i]=(int)(Math.random()*20);
            System.out.println(ar[i]);*/

       // }
    }}