package samonova.lesson8;

import java.util.Scanner;

public class data {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите год ");
        System.out.println(">>");
        int year = new Scanner(System.in).nextInt();

        System.out.println("Введите месяц ");
        System.out.println(">>");

        String month = sc.nextLine();
        System.out.println("Введите день");
        System.out.println(">>");
        String day = sc.nextLine();
        System.out.println(day + ":" + month + ":" + year);

        }
    }

