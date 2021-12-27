package samonova.lesson8;

public class Ex2 {
    public static void main(String[] args) {
        // Дано целое число.
        // Если оно является положительным, то прибавить к не му 1;
        // в противном случае не изменять его. Вывести полученное число.

        int i = 6;
        if (i > 0) {
            i++;
            System.out.println(i);
        } else {
            System.out.println(i);
        }
    }
}
