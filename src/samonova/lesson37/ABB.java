package samonova.lesson37;

public class ABB {
    public static void main(String[] args) {


        AB number1 = (a, b) -> {
            if (a < b) {
                return a;
            }
            if (a > b) {
                return b;
            } else return 0;

        };

        System.out.println(number1.abb(22, 3));
    }
}
