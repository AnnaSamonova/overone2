package samonova.lesson14.DZ;

public class Naoborot {
    public  static void printNaoborot (String txt) {
        String [] newTxt = txt.split("\n");


        for (int i = newTxt.length-1; i >= 0; i--) {
            System.out.println(newTxt [i]);

        }
        System.out.println();

    }
}
