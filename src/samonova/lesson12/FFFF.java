package samonova.lesson12;

import java.util.Arrays;

public class FFFF {
    public static void main(String[] args) {
// решегие татьяны по сортировке

        int [] array = {-1, 20, -35, 40,10, 15,58,0};

        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int min_i = i;

            for (int j = i+1; j <array.length ; j++) {
                if (array[j]<min){
                    min=array[j];
                    min_i=j;

                }

            }
            if(i!=min_i){
                int n = array[i];
                array[i]=array[min_i];
                array[min_i]=n;
            }


        }
        System.out.println(Arrays.toString(array));
    }



}
