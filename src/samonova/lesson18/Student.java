package samonova.lesson18;

public class Student extends Person {
private String univer;

    public Student(String name, String univer) {
        super(name);
        this.univer=univer;
    }


    @Override
    public void print() {
        System.out.println(getName() + " " + univer);

    }
}