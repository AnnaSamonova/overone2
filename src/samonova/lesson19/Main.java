package samonova.lesson19;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Lexa", 25);
      //  person.goToTheStreat();
        Person person1 = new PersonAfternoon("Valera", 56);
       // person1.goToTheStreat();
        Person person2 = new PersonEvning("Pavel", 27);
       // person2.goToTheStreat();


        // полиморфный вызов метода
        Person [] mas = {person, person1, person2};
        for (Person object : mas) {
            object.goToTheStreat();

        }
    }
}
