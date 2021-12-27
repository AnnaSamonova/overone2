package samonova.lesson9;

// 1. Создать массив [20], заполнить его числами и вывести чётные.
public class Les9Dz1 {
    public static void main(String[] args) {
        int[] arr = new int[20];  // создаеем массив
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i*3;        // заполняем элементами
        }

        System.out.print("Исходный массив ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");   // выводим массив

        }
        System.out.println();
        System.out.print("Чётные ");
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {            // проверяем на четность
                System.out.print(arr[i] + " ");
            }

        }

    }
}
