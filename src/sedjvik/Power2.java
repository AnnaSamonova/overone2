package sedjvik;

public class Power2 {
    public static void main(String[] args) {
        // Листинг 1.3.3. Вычисление степеней 2

        int n = Integer.parseInt(args[0]);
        int power = 1 ;
        int i = 0;
        while (i<=n){
            System.out.println(i + " " + power);
            power=2*power;
            i=i+1;
        }

    }
}
