package samonova.lesson12;

import java.util.Arrays;

public class Les12DzNew {
    public static void main(String[] args) {

        System.out.print("Исходный массив: ");
        int[] ar = new int [4];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = (int) (Math.random() * 3);

            System.out.print(ar[i] + " ");
        }

        System.out.println();

        boolean masss = true;
        for (int i = 0; i < ar.length - 1; i++) {
            if (ar[i] > ar[i + 1]) {
                masss = false;
                break;
            }


        }
        if (masss) {
            System.out.println("Массив является строговозрастающей последовательностью");
        } else {
            System.out.println("Массив НЕ  является строговозрастающей последовательностью");
        }


        System.out.println("Исходный и Отсортированный массив");

        int[] ar2;
        ar2 = ar;
        System.out.println(Arrays.toString(ar2));

        boolean isOk = true;   // устанавливаем для первого прохода
        while (isOk) {
            isOk = false;                 // устанавливаем в ожидании возможной замены ( если была замена, то внизу значение станет тру)

            for (int i = 0; i < ar2.length - 1; i++) {
                if (ar2[i] > ar2[i + 1]) {
                    int k = ar2[i];
                    ar2[i] = ar2[i + 1];
                    ar2[i + 1] = k;
                    isOk = true;              //true  означает что замена была ( иначе бы мы не дошли до этой строки)
                }

            }

        }


        System.out.println(Arrays.toString(ar2));

    }
}


