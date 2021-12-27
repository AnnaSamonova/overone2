package samonova.lesson17;

public class Lesson17 {
    public static void main(String[] args) {
/*Person  person = new Person();

person.setName( "Петр");
        System.out.println(person.getName());*/

        Person grisha = new Person ("Гриша ");
        grisha.printToConsol();
        Student student = new Student ("Петя", "БГУ");
        student.getNameAndUniver();

        Student student1 = new Student("Аня ", 29,  "Сухого ");
        student1.printToConsol();
        student1.setName(" Анна ");
        System.out.println(student1.getName());
        student1.printToConsol();


    }
}
