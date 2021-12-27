package samonova.lesson14.DZ;

public class Replace {


    public static void printReplace(String txt) {

        String newText = txt;

        newText = (newText.replace('а', 'я'));
        String newText2 = newText;
        System.out.println(newText2.replace('ё', 'е'));
        System.out.println();

    }


}

