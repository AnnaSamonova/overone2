package samonova.lesson17.dz;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat();
        Tiger teger1 = new Tiger();
        Animal animal1 = new Animal("корова", 4);

        System.out.println(cat1.getName());
        cat1.setName("кот Барсик");
        System.out.println(cat1.getName());

        System.out.println(cat1.getLegs());
        cat1.zvuk("мяу");

        animal1.say( " Звуки животных ");

    }
}