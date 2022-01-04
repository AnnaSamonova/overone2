package samonova.lesson28;

public class Exception2 {
    double result = 0;

double divNumb (int a, int b) {
    double result = 0;
    try {
        result = a/b;
    }
    catch (ArithmeticException e) {
        System.out.println("div by zero");
    }
    finally {
        System.out.println("hi");; // любое
    }
    return result;
}
}
