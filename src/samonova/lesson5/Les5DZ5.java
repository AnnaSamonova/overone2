package samonova.lesson5;
 //Вывести красивую таблицу умножения, как на фото сниз
public class Les5DZ5 {
    public static void main(String[] args) {
        int count =0;
        for (int i=1; i<=9; i++) {
            for (int j=1; j<=9; j++) {
                count=i*j;
                System.out.print(j+ " * " + i + " = " + count + "\t" );
            }
            System.out.println();
        }
    }
}
