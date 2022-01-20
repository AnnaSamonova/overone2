package samonova.lesson31;

public class Average<T extends Number>  {

    private T[] array;

    public Average (T[] array) {
        this.array = array;
    }

    public double average () {
        double sum = 0;

        for (T value : array) {
            sum= sum+value.doubleValue();

        }
        return sum/array.length;
    }
}
