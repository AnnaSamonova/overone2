package samonova.lesson23;

import java.util.*;

public class Lessson23Tree {
    public static void main(String[] args) {

        TreeSet<String> city = new TreeSet<>();
        city.add("Minsk");
        city.add("Gomel");
        city.add("Mogilev");
        city.add("Brest");
        city.add("Vitebsk");
        city.add("Grodno");
        System.out.println(city.size());

        city.remove("Brest");
        System.out.println(city);

        for (String s : city) {
            System.out.println(s);

        }

        System.out.println(city.first() + " " + city.last());

//?????
        SortedSet<String> set = city.subSet("Gomel", "Grodno");
        System.out.println(set);
String next = city.higher("Minsk");
        System.out.println(next);

        String previos = city.lower("Minsk");
        System.out.println(previos);

        NavigableSet<String> set1 = city.descendingSet();
        System.out.println(set1);

        SortedSet<String> sortedset = city.headSet("Minsk");
        System.out.println(sortedset);

        SortedSet<String> sortedset1 = city.tailSet("Minsk");
        System.out.println(sortedset1);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
//*************************************
        TreeMap<Integer, String> citys = new TreeMap<>();
        citys.put(7,"Min");
        citys.put(3,"Gom");
        citys.put(6,"Mog");
        citys.put(1,"Bres");
        citys.put(2,"Vit");
        citys.put(4,"Grod");

        System.out.println(citys);

        System.out.println(citys.size());

        String obj = citys.get(7);
        System.out.println(obj);

        for (Map.Entry<Integer, String> integerStringEntry : citys.entrySet()) {
            System.out.println(integerStringEntry.getKey() + " " + integerStringEntry.getValue());

            Set<Integer> keys = citys.keySet();
            System.out.println(keys);

            //Collections <String> value

        }


    }
}
