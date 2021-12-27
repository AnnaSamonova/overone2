package samonova.lesson19.interfacee;

public class Bee implements Fly {
   int age;

    public Bee(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Я пчелка и мне " + age + " лет";
    }

    @Override
    public void fly() {
        System.out.println(toString());
    }
}
