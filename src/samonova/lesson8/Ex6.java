package samonova.lesson8;

public class Ex6 {
    public static void main(String[] args) {
        // Дано целое число N (> 0).
        // Используя операции деления нацело и взятия остатка от деления,
        // найти число, полученное при прочтении числа N  справа налево.
        int n= 4567;
        int k= 0;
        while (n>0) {
            k=n%10;
            System.out.print(k);
            n=n/10;
        }

    }
}
