package samonova.lesson28;

public class Exception1 {
    double divNum (int a, int b){
        double result = 0;

        try {
            result = a/b;
        }catch (ArithmeticException e) {
            System.out.println("div by zero or " + e);

        }

return result;
    }


}
