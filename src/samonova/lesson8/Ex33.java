package samonova.lesson8;

import java.util.Scanner;

public class Ex33 {
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
                result= "Зима";
                System.out.println(result);
                break;
            case 2:
                result= "Весна";
                System.out.println(result);
                break;
            case 3:
                result= "Лето";
                System.out.println(result);
                break;
            case 4:
                result= "Осень";
                System.out.println(result);
                break;
            case 5:
                System.out.println("Ошибка ввода, попробуйте заново");
                break;


        }

    }
}
