package samonova.lesson5;
//Вывести звездочки на консоль в 3 строки и 5 колонок.
public class Les5DZ4 {
    public static void main(String[] args) {
        char star ='*';
        for (int i=1; i<=3; i++) {
            for (int j=1; j<=5; j++) {
                System.out.print(star + " ");
            }
            System.out.println();
        }
    }
}
