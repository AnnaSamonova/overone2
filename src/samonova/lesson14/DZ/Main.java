package samonova.lesson14.DZ;

public class Main {
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

        System.out.println("1. Вывести каждое слово с новой строки и удалить все ненужные пробелы.");
        Split.printSplit(text.trim());


        System.out.println("2. Заменить все буквы «ё» на «е» и все буквы «а» на «я».");
        Replace.printReplace(text);


        System.out.println("3. Вырезать строку «И днём и ночью».");
        Substring.printTSubstring(text);


        System.out.println("4. Вывести текст в ВЕРХНЕМ РЕГИСТРЕ.");
        Upper.printUpperCase(text);

        System.out.println("5. Вывести текст в нижнем регистре.");
        Lower.printLowerCase(text);

        System.out.println("6. Проверить, содержит ли наш текст строку «Русалка на ветвях сидит;»");
        Rusalka.rusalkaSubstring(text);

        System.out.println("7. Переверните текст наоборот, что бы начало оказалось в конце, а конец текста в начале.");
        Naoborot.printNaoborot(text);

        System.out.println("8. На каждую строку создайте отдельную ссылку. Сравните ссылки(==) и значения(.equals()).");
        String s1 = "У лукоморья дуб зелёный;";
        String s2 = "Златая цепь на дубе том:";
        String s3 = "И днём и ночью кот учёный";
        String s4 = "Всё ходит по цепи кругом;";
        String s5 = "Идёт направо — песнь заводит,";
        String s6 = "Налево — сказку говорит.";
        String s7 = "Там чудеса: там леший бродит,";
        String s8 = "Русалка на ветвях сидит;";
        String s9 = "Там на неведомых дорожках";
        String s10 = "Следы невиданных зверей;";

        System.out.println("строка 1  равна строке 2 ? "  + s1.equals(s2));
        System.out.println("строка 6 равняется строке \"Налево — сказку говорит.\" "+ (s6=="Налево — сказку говорит."));





    }
}
