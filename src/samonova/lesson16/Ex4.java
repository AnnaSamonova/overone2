package samonova.lesson16;

//4. Написать функцию, которая возвращает наибольший общий делитель.

public class Ex4 {
    public static void main(String[] args) {
        System.out.println(nod(122, 56));

    }

    public static double nod(double a, double b) {
        while ((a != 0) && (b != 0)) {
            if (a > b) {
                a = a % b;
            } else b = b % a;
        }
        return (a + b);


    }
}
