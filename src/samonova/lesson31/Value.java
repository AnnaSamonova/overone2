package samonova.lesson31;

public class Value <T> {

    private T t; //  создали переменную типа Т

    public void add(T t) {
        this.t = t;


    }
    public T getT(){
        return t;
    }

}
