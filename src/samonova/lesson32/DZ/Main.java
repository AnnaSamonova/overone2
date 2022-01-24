package samonova.lesson32.DZ;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {


// сравниваем по возрасту compareTo
        Person person1 = new Person("Anna", 30, 1000.5);
        Person person2 = new Person("Danissimo", 40, 600.5);
        Person person3 = new Person("Mon", 38, 700);

        TreeSet<Person> treeSPerson = new TreeSet<>();

        treeSPerson.add(person1);
        treeSPerson.add(person2);
        treeSPerson.add(person3);

        for (Person personnn : treeSPerson) {
            System.out.println(personnn);

        }

        System.out.println("-------------------------");
        System.out.println("Сравниваем по зп (compare)");

        ArrayList<Person> arListPerson = new ArrayList<>();
        arListPerson.add(person1);
        arListPerson.add(person2);
        arListPerson.add(person3);

        SalaryComparator salaryComp = new SalaryComparator();
        arListPerson.sort(salaryComp);
        for (Person listPers : arListPerson) {
            System.out.println(listPers);

        }

        System.out.println("-------------------------");
        System.out.println("Сравниваем по имени  (compare)");


        ArrayList<Person> arListPerson1 = new ArrayList<>();
        arListPerson1.add(person1);
        arListPerson1.add(person2);
        arListPerson1.add(person3);

        NameComparator nameComparator = new NameComparator();
        arListPerson1.sort(nameComparator);
        for (Person listPerson : arListPerson1) {
            System.out.println(listPerson);

        }


        System.out.println("-------------------------");
        System.out.println("Применим сразу 2 сравнения по имени и зп  (compare)");

        Person person4 = new Person("Anna", 33, 999);

        ArrayList<Person> arListPerson2 = new ArrayList<>();
        arListPerson2.add(person1);
        arListPerson2.add(person2);
        arListPerson2.add(person3);
        arListPerson2.add(person4);

        Comparator name2Comparator = new NameComparator().thenComparing(new SalaryComparator());
        arListPerson2.sort(name2Comparator);
        for (Person list2Person : arListPerson2) {
            System.out.println(list2Person);


        }
    }
}