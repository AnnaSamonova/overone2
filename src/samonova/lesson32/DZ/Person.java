package samonova.lesson32.DZ;

public class Person implements Comparable<Person> {

    private String name;
    private int age;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Person person) {
        if (this.age == person.age) {
            return 0;
        }
        if (this.age > person.age) {
            return 1;
        } else return -1;
    }

    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person is " +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary;
    }
}
