package samonova.lesson18.parametrObj;

public class Main {
    public static void main(String[] args) {
        Person ivan = new Person ("Ivan");
        System.out.println(ivan.getName());
        replaceName(ivan);
        System.out.println(ivan.getName());
    }

    static void replaceName (Person person) {
        person.setName("NeIvan");

    }
}
