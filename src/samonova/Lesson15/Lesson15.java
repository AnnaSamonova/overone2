package samonova.Lesson15;

import java.util.Scanner;

public class Lesson15 {
    public static void main(String[] args) {
        String text = "   У лукоморья дуб зелёный;\n" +
                "Златая цепь на дубе том:\n" +
                "И днём и ночью кот учёный\n" +
                "Всё ходит по цепи кругом;\n" +
                "Идёт направо — песнь заводит,\n" +
                "Налево — сказку говорит.\n" +
                "Там чудеса: там леший бродит,\n" +
                "Русалка на ветвях сидит;\n" +
                "Там на неведомых дорожках\n" +
                "Следы невиданных зверей;";

     /*   String s1 = text.replace('а', 'я').replace('ё','е');
        System.out.println(s1);*/

       /* String iDnem = "И днём и ночью";
        int index =text.indexOf(iDnem);
        System.out.println(index);

        String iDnem2 = "Всё ходит по цепи кругом;";
        int index2 =text.indexOf(iDnem2);
        System.out.println(index2);
        String s2 =text.substring(0,53);
        String s3 =text.substring(79);
        System.out.println(s2+s3);*/

       /* StringBuffer buf  = new StringBuffer(text);
        System.out.println(buf.reverse());
    */

        System.out.println("Введите первое число");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Введите второе число");
        int b = sc.nextInt();
        number(a,b);
    }

    public static int number(int a, int b){
        for (int i = a; i <=b ; i++) {
            System.out.println(i);

        }

        return 0;
    }
}
