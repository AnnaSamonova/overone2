package samonova.lesson32.DZ;

import java.util.Comparator;

public class NameComparator implements Comparator <Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getName().length()==o2.getName().length()){
        return 0;}
        if (o1.getName().length()>o2.getName().length()){
            return 1;}
        else return -1;
    }
}
