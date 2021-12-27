package samonova.lesson22;


import java.util.HashSet;

public class Lesson22 {
    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Monday");
        hashSet.add("Tuesday");
        hashSet.add("Wednesday");

        System.out.println(hashSet);


        System.out.println(hashSet.contains("Monday"));
    //удаляем
       // hashSet.remove("Tuesday");
       // System.out.println(hashSet);


        //  прошли по коллекции и вывели элементы
        for (String day : hashSet) {
            System.out.println(day);

        }
//  добавили элемент в коллекцию
        hashSet.add("Frieday");
        System.out.println(hashSet);


        //  проверили наличие элемента
        System.out.println(hashSet.contains("Frid"));

        // записали в булевкую перемен
        boolean a = hashSet.contains("hh");


        //  коллекция объектов
        HashSet<Person> people = new HashSet<>();
        people.add(new Person ("Vasya"));
        people.add(new Person ("Petya"));
        people.add(new Person ("Misha"));
        people.add(new Person ());


        for (Person person : people) {
            System.out.println(person.getName());



        }
    }

}
