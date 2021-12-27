package samonova.lesson6;

public class sss {
    public static void main(String[] args) {
        int i = 345645678;
        int chet = 0;
        int nechet = 0;
        while (i > 0) {
            int k = i % 10;
            if (k % 2 == 0) {
                chet = chet * 10 + k;
            } else {
                nechet = nechet * 10 + k;
            }
            i = i / 10;
        }
        System.out.println(chet);
        System.out.println(nechet);
    }


}
