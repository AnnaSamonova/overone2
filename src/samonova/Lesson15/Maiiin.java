package samonova.Lesson15;

import java.util.Scanner;

public class Maiiin {
    public static void main(String[] args) {
        System.out.println("Введите 1е число");
        System.out.print(">>");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Введите 2е число");
        System.out.print(">>");
        int b = new Scanner(System.in).nextInt();

        GetSum sum = new GetSum();
        System.out.println(sum.getSum(a,b));


    }
}
