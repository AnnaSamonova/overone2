package samonova.lesson5;

public class Les5DZdop {
    public static void main(String[] args) {
// создвем заголовки таблицы
        System.out.print("x" + "\t");
        for (int a = 1; a <= 10; a++) {
            System.out.print( a + " " + "\t");
        }
        System.out.println();
        //если раскомментить кусок ниже, то получается что есть заголовки таблицы, но сама таблица внизу
     /*   for (int b = 1; b < 11; b++) {
            System.out.println(b);
        }*/
// создаем таблицу
        int count = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " " + "\t");
            for (int j = 1; j <= 10; j++) {
                count = i * j;
                System.out.print(count + " " + "\t");
            }
            System.out.println();
        }
    }
}

