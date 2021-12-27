package samonova.lesson16;

public class аааааааа {
    public static void main(String[] args) {
nod(122,56);

    }
    public static void nod(int number1, int number2) {
        for (int i = number1; i > 0; i--) {
            if (number1 % i == 0 && number2 % i == 0) {
                System.out.println("NOD = " + i);
                break;
            }
        }
    }
}
