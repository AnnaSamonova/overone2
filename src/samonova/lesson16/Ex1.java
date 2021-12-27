package samonova.lesson16;

//  1. Написать функцию, которая возвращает сумму чисел от 1 до 5.
public class Ex1 {
    public static void main(String[] args) {
        System.out.println(numSum(1, 5));

    }

    public static int numSum(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum = sum + i;

        }
        return sum;
    }
}
