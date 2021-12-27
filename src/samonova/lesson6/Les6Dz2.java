package samonova.lesson6;

public class Les6Dz2 {
    public static void main(String[] args) {
        //  Вывести среднее значение всех цифр в числе

        int i = 234567654;
        double sum = 0;
        int k = 0;
        double s = 0;
        while (i > 0) {
            k = i % 10;

            sum = sum + k;
            s++;
            i = i / 10;
        }

        System.out.println(sum / s);

    }

}
