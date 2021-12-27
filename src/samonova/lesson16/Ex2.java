package samonova.lesson16;
//  2. Написать функцию, которая возвращает среднее арифметическое от 1 до 9.

public class Ex2 {
    public static void main(String[] args) {

        System.out.println(average(1, 9));

    }

    public static double average(int a, int b) {
        int sum = 0;
        int count = 0;
        double result = 0;
        for (int i = a; i <= b; i++) {
            sum = sum + i;
            count++;


        }
        result = sum / count;

        return result;
    }
}
