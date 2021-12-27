package samonova.lesson8;

public class Ex7 {
    public static void main(String[] args) {
        // Дано целое число N (> 0).
        //Используя операции деления нацело и взятия остатка от деления,
        //найти количество и сумму его цифр.
        int n = 55660001;
        int k = 0;
        int count = 0;
        int  sum = 0;

        while (n > 0) {
            k = n % 10;
            count++;
            sum = sum + k;
            n = n / 10;
        }

        System.out.println("сумма = " + sum);
        System.out.println("количество цифифр = " + count);
    }
}
