package samonova.lesson17;

public class Student extends Person {

private String univer;

public Student (String name, String univer) {
    super (name);
    this.univer = univer;

}

    public Student(int age, String univer) {
        super(age);
        this.univer = univer;
    }

    public Student (String name, int age, String univer) {
    super (name, age);
    this.univer = univer;


}

void getNameAndUniver () {
    System.out.println(getName() + " " + univer);
}

    @Override
    public void printToConsol() {
        System.out.println(univer + " " + getName() + " " + getAge());
    }
}
