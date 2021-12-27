package samonova.lesson5;
//Вывести последовательность чисел 2 4 8 16 32 64 128 256 512 1024.
public class Les5DZ1 {
    public static void main(String[] args) {
        for ( int i =2; i<=1024; i= i*2) {
            System.out.print(i + " ");
        }
    }
}
