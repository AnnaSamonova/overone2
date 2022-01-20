package samonova.lesson31;

public class Lesson31 {
    public static void main(String[] args) {

Integer [] integers = {1, 2, 3};
String [] strings = {"hi", "ha"};
Double [] doubles = {1.2, 2.3, 3.1};
printToConsol(integers);
printToConsol(strings);
printToConsol(doubles);

    }
    //  общий метод (обобщенный)
    public static <T> void printToConsol (T [] array){

        for (T element : array) {
            System.out.println(element);

        }

        //------------------------


        Value intVal = new Value();
        Value strVal = new Value();

        intVal.add(1111111111);
        strVal.add("hi");
        System.out.println(intVal.getT());
        System.out.println(strVal.getT());


        // -----------------

        Integer [] intar = {1,2,3,4};
        Average <Integer>inegeravver = new Average<>(intar);
        System.out.println(" среднее знач для интеджер " + inegeravver.average());


        Double [] doublear = {1.1,2.1,3.1,4.1};
        Average <Double>doubleavver = new Average<>(doublear);
        System.out.println(" среднее знач для double " + doubleavver.average());


    }
}
