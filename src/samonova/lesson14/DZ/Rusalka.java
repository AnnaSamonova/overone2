package samonova.lesson14.DZ;

public class Rusalka {
    public static void rusalkaSubstring(String txt) {

        boolean stroka = false;

        String[] txtmas = txt.split("\n");
        for (String word : txtmas) {

            if (word.equals("Русалка на  ветвях сидит;")) {
                stroka = true;
                break;
            }

        }
        System.out.println(stroka);
        System.out.println();



    }


}

