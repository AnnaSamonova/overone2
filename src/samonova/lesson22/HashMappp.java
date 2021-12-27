package samonova.lesson22;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMappp {
    public static void main(String[] args) {
        HashMap<Integer, String> hashmap = new HashMap<>();
        hashmap.put(1,"Jan");
        hashmap.put(2,"Feb");
        hashmap.put(3,"Mar");
        hashmap.put(4,"Apr");
        hashmap.put(5,"May");
        hashmap.put(3,"May");


        System.out.println(hashmap);
String value = hashmap.get(5);
        System.out.println(value);


        Set<Integer>keys = hashmap.keySet();
        System.out.println(keys);

        ArrayList<String> list = new ArrayList<>(hashmap.values());
        System.out.println(list);

        hashmap.replace(1,"Jan", "One");
        System.out.println(hashmap);

        hashmap.remove(3);
        System.out.println(hashmap);

        System.out.println(hashmap.containsKey(3));

        System.out.println(hashmap.containsValue("Apr"));

        System.out.println(hashmap.size());

        // hasmap.clear();

        // проверить есть ли вообще значения

        if (!hashmap.isEmpty()){
            System.out.println(hashmap);
        }
//  для перебора коллекции
        for(Map.Entry<Integer, String> value1 : hashmap.entrySet()){
            System.out.println(value1);}

        Map<Integer, String> hashMap2 = new HashMap<>();

        hashMap2.put(5, "hi");
        hashMap2.put(6, "hit");
        hashMap2.put(555, "hitt");

        hashmap.putAll(hashMap2);
        System.out.println(hashmap);

        Map<Integer, Person> people = new HashMap<>();
        people.put(1, new Person ("Vasya"));
        people.put(2, new Person ("Va"));
        people.put(3, new Person ("Пфффasya"));

        for(Map.Entry<Integer, Person> person: people.entrySet()){
           // System.out.println(person);
            System.out.print(person.getKey() + " ---> " );
            System.out.println(person.getValue());
        }



        }





}
