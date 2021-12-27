package samonova.lesson9;

public class Les9Dz2 {
    public static void main(String[] args) {
       // Создать массив на 20 елементов, замените каждый элемент с нечётным индексом на ноль.
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {  // заполняем массив
            arr[i] = i *2;
        }
        System.out.print("Исходный ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");      // выводим

        }
        System.out.println();
        System.out.print("Новый ");

        for (int i = 0; i < arr.length; i++) {  // нечетные индесы заменяем на ноль
            if (i % 2 != 0) {
                arr[i] = 0;

            }
            System.out.print(arr[i] + " ");

        }


    }
}
