package samonova.lesson19.interfacee;

public class Plane implements Fly {
 String name;
 int age;

    public Plane(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void fly() {
        System.out.println(toString());

    }

    @Override
    public String toString() {
        return "Я " + name +" мне " +
                age + " лет";
    }
}

