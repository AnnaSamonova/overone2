package samonova.lesson6;

public class Les6Dz1 {
    public static void main(String[] args) {
        // Вывести чётные и нечётные числа()234567654
        int i = 234567654;
        int k = 0;
        while (i >0) {
            k = i % 10;
            if (k % 2 == 0) {
                System.out.print(k + " - четное число ");

            }
            else if ( k%2!=0) {
                System.out.println( k+ " - нечетное число ");
            }
            i = i / 10;

        }

        System.out.println();

    }
}
