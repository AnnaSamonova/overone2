package samonova.lesson14;

public class MainLesson14 {
    public static void main(String[] args) {

        String s = "Hello";
        String ss = "hello";
        String s5 ="Hello World  ";

        String s8 = s5.substring(7);
        System.out.println(s8);

        String s9 =s5.substring(3,8);
        System.out.println(s9);

        System.out.println(s5.toLowerCase());
        System.out.println(s5.toUpperCase());

        String text = "Vasya Petya Ivan Vanov Petrrov";
        String [] words = text.split(" ");
        for (String word : words) {
            System.out.println(word);

        }



        System.out.println(s5);

        s5.trim();
        System.out.println(s5.trim());

        String s6 =s5.replace('l','o' );
        System.out.println(s6);




        System.out.println();


        System.out.println(s.equals(ss));


        String s1 = "world";
        String s3 =s + s1;
        System.out.println(s3);

        String s33 =String.join(" ", s1, s);
        System.out.println(s33);

        char s4 =s.charAt(4);
        System.out.println(s4);

String s11 = String.valueOf(1);
String s12 = String.valueOf(1.1);
String s13 = String.valueOf(1555555555555555L);
        System.out.println(s11);
        System.out.println(s12);
        System.out.println(s13);

        Integer i = Integer.parseInt("123");
        Double dd =Double.parseDouble("12.55");
        System.out.println(i);
        System.out.println(dd);

        String number = "1234567";
        System.out.println(number.indexOf('6'));
    }
}
