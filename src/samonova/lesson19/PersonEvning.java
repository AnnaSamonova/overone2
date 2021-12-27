package samonova.lesson19;

public class PersonEvning extends  Person {

    public PersonEvning(String name, int age) {
        super(name, age);
    }

    @Override
    public void goToTheStreat() {
        System.out.println( toString() + " я гуляю вечером " );
    }
}
