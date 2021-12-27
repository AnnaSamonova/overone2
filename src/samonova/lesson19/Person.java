package samonova.lesson19;

public  class Person {
    private  String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void goToTheStreat (){
        System.out.println(toString()+"я гуляю по утрам ");
    }

    @Override
    public String toString() {
        return "Я " + name + " мне " + age + " лет " ;
    }
}
