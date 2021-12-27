package samonova.lesson8;

public class Ex1 {
    public static void main(String[] args) {
        // Дано расстояние L в сантиметрах.
        //Использую операцию деления нацело, найти количество полных метров в нём (1м = 100см)

        int l = 350;
        l = l / 100;
        System.out.println("расстояние равно " + l + "м");
    }
}
