package sedjvik;

public class Quadratic {
    public static void main(String[] args) {
        // Листинг 1.2.3. Вычисление корней квадратного уравнения

        double b= Double.parseDouble(args[0]);
        double c= Double.parseDouble(args[1]);
        double discr = b*b-4.0*c;
        double d = Math.sqrt(discr);
        System.out.println((- b + d ) / 2.0);
        System.out.println(( - b - d ) / 2.0 );
    }
}
