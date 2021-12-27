package samonova.lesson13.practic;

public class WorkOfArray {

    public static int[] sort(int[] mas) {
       //Arrays.sort(mas);


        boolean isFlag = true;

        while (isFlag) {
            isFlag=false;

        for (int i = 0; i < mas.length-1; i++) {
            if(mas[i]>mas[i+1]){
                int k = mas[i];
                mas[i]=mas[i+1];
                mas[i+1] =k;
                isFlag = true;
            }

        }
        }
        return mas;

    }

    public static void printToArray(int [] mas) {

        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");


        }
        System.out.println();

    }

}
