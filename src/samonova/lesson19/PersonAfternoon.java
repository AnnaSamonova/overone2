package samonova.lesson19;

public class PersonAfternoon extends  Person {


    public PersonAfternoon(String name, int age) {
        super(name, age);


    }
    @Override
    public void goToTheStreat() {

        System.out.println( toString() + " я гуляю после обеда" );
    }
}
