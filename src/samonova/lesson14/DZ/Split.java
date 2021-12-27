package samonova.lesson14.DZ;

public class Split {
    public static void  printSplit (String  txt) {

        String[] textmas = txt.split(" ");
        {
            for (String newStr : textmas) {

                System.out.println(newStr);
            }

        }
        System.out.println();
    }}