package samonova.lesson8;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        // Переменная num может принимать 4 значения: 1, 2, 3 или 4.
        // Если она имеет значение '1', то в переменную result запишем 'зима',
        // если имеет значение '2' – 'весна' и так далее. Решите задачу через switch-case.
        System.out.println("Введите число от 1 до 4, что бы узнать пору года ");
        System.out.println(">>");
        int num = new Scanner(System.in).nextInt();
        String result;



        switch (num) {
            case 1:
                System.out.println("зима");
                break;
            case 2:
                System.out.println("весна");
                break;
            case 3:
                System.out.println("лето");
                break;
            case 4:
                System.out.println("осень");
                break;
            case 5:
                System.out.println("Ошибка ввода, попробуйте заново");
                break;


        }
    }
}
