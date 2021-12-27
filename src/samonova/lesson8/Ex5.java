package samonova.lesson8;

public class Ex5 {
    public static void main(String[] args) {
        //Даны два целых числа A и B (A < B).
        // Найти сумму всех целых чисел от A до B включительно.
        int sum=0;
        for (int i = 2; i < 5; i++) {
            sum=sum+i;

        }
        System.out.println(sum);
    }
}
