package samonova.lesson9;

public class Err {
    public static void main(String[] args) {
        int[] ar = new int[10];
//        for (int i = 0; i < ar.length; i++) {
//            ar[i]= i+1;
//        }
//        System.out.println("мсходный " + Arrays.toString(ar));
//        System.out.println("yjdsq");
//
//        for (int i : ar) {
//            if (i%2==0) {
//                System.out.print(i+ " ");
//            }
//
//        }

        int[] arra = {254, 265, 54, 4, 8, 9, 333, 58654, 22};
        int min = arra[0];
        int max = arra[0];
        for (int num : arra) {
            if (num > max)
                max = num;
            if (num < min)
                min = num;
        }
        System.out.println(min + " " + max);
    }}

