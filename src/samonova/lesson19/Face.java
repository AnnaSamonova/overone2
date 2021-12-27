package samonova.lesson19;

import java.util.Arrays;

public class Face {
    public static void main(String[] args) {
        String [] mas = { "Строитель", "Пекарь", "Водитель", "Актер", "Инженер" };
        System.out.println(Arrays.toString(mas));
        int number = mas.length;


        int k=0;
       k=(int) (Math.random()*(number+1)+0);
        System.out.println(k);




        }
    }

