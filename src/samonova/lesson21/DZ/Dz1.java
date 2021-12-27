package samonova.lesson21.DZ;

import java.util.ArrayList;
import java.util.Collections;

public class Dz1 {
    public static void main(String[] args) {

        // сразу пришел в голову такой метод решения
        int[] loto = new int[11];
        for (int i = 0; i < loto.length; i++) {
            int k = (int) (Math.random() * 100);
            System.out.print(k + " ");

        }
        System.out.println();


        // через коллекции


        ArrayList<Integer> loto2 = new ArrayList<>(100);

        for (int i = 0; i < 100; i++) {

            loto2.add(i);
        }
        Collections.shuffle(loto2);
        for (int i = 0; i < 11; i++) {
            System.out.print(loto2.get(i) + " ");

        }

    }
}
