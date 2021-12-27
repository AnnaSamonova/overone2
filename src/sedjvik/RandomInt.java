package sedjvik;

public class RandomInt {
    public static void main(String[] args) {
        // Листинг 1.2.5. Преобразование типа для получения случайного целого числа
        int n = Integer.parseInt(args[0]);
        double r = Math.random(); // Равномерное распределение о т 0 . 0 до 1 .0
        int value = (int) (r*n); // / / Равномерное распределение о т 0 до n - 1
        System.out.println(value);

    }
}
