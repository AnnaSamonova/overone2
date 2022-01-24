package samonova.lesson32.DZ;

import java.util.Comparator;

public class SalaryComparator implements Comparator <Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getSalary() == o2.getSalary()) {
            return 0;
        }
        if (o1.getSalary() > o2.getSalary()) {
            return 1;
        } else return -1;
    }
}
