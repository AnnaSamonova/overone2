package samonova.lesson6;

public class Les6Dz3 {
    public static void main(String[] args) {
        // Вывести макс и мин цифру в числе
        int i = 234567564;
        int min = 9;
        int max = 0;
        int k =0;

        while (i>0) {
            k=i%10;
            if(max<k) {
                max=k;
            }
            else if (min>k) {
                min=k;
            }
            i=i/10;
        }
        System.out.println("минимальное - " +min + ", максимальное - " + max );
    }
}
