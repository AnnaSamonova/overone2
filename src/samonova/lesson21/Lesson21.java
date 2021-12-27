package samonova.lesson21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Lesson21 {
    public static void main(String[] args) {
        //arraylist and linkedlist
ArrayList <Integer> list1= new ArrayList<>();

list1.add(1);
list1.add(12);
list1.add(66);
System.out.println(list1);

ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list2.add(i);

        }
        System.out.println(list2);

        ArrayList <Integer> list3 = new ArrayList<>(10);
        list3.add(0,2);
        list3.add(1,3);
        list3.add(2,4);
        list3.add(3,5);
        list3.add(4,6);

        list3.remove(3);

        System.out.println(list3);

        for (Integer integer : list3) {
            System.out.println("number=" + integer);

            ArrayList <Integer> arayList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
            System.out.println(arayList);

            ArrayList<String> ar = new ArrayList<>(Arrays.asList("Anya", "Galya"));
            System.out.println(ar);

            ArrayList <String> months = new ArrayList<>();
            months.add("Янв ");
            months.add("Фев ");
            months.add("Март ");
            months.add("Апр ");
            System.out.println(months.size());

            months.set(1,"новый ");
            System.out.println(months);

            months.remove("Янв ");
            System.out.println(months);

            System.out.println(months.get(2));

            int b1=months.indexOf("Март ");
            System.out.println(b1);

            boolean b2 = months.contains("июнь");
            System.out.println(b2);

            Collections.swap(months, months.indexOf("Апр "), months.indexOf("Март ") );
            System.out.println(months);

            Collections.sort(months);
            System.out.println(months);

            Collections.reverse(months);
            System.out.println(months);

            months.clear();
            System.out.println(months);

            System.out.println(list1.equals(months));

        }

        String [] strArray = {"a", "b", "c", "d", "e", "f"};
        ArrayList<String> ar11 = new ArrayList<>(Arrays.asList(strArray));
        System.out.println(ar11);

        String [] strArray1 = {"a", "b", "c", "d", "e", "f"};
        boolean b =Arrays.asList(strArray1).contains("b");
        System.out.println(b);

        //**********************************
                  //LINKEDLIST


        LinkedList <Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            linkedList.add(i);


        }
        System.out.println(linkedList);

        System.out.println(linkedList.getFirst() + " " + linkedList.getLast());

        System.out.println(linkedList.removeFirst() + " " + linkedList.removeLast());
        System.out.println(linkedList);


        String mitsub = "Mitsub OutLend";
        String mazda = "Mazda 6";
        String honda = "Honda x";
        String toyota = "Toyota Highlander";

        LinkedList <String> cars = new LinkedList<>();
        cars.add (mazda);
        cars.add (honda);

        cars.addFirst(toyota);
        cars.addLast (mitsub);
        System.out.println(cars);

       // cars.clear();

        System.out.println(cars.peekFirst());
        System.out.println(cars.peekLast());

        System.out.println(cars.pollFirst());
        System.out.println(cars.pollLast());
        System.out.println(cars);

    }


}
