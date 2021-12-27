package samonova.lesson13.practic;

public class MaxNumber {

    public int max(int a, int b) {
        int maxNumber = 0;
        if (a > b) {
            maxNumber = a;
        } else {
            maxNumber = b;
        }
return maxNumber;
    }

    public void print () {
        System.out.println(max(4,5));
    }

}
