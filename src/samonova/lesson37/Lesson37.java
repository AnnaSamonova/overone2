package samonova.lesson37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Lesson37 {
    public static void main(String[] args) {

//Operations sum = (x, y) -> x+y;
//Operations sub = (x, y) -> x-y;
//Operations mul = (x, y) -> x*y;
//Operations div = (x, y) -> x/y;
//
//        System.out.println(sum.calculate(5, 4));
//        System.out.println(sub.calculate(5, 4));
//        System.out.println(mul.calculate(5, 4));
//        System.out.println(div.calculate(5, 4));
//
//        TaskOPerations taskOPerations =()->9/3;
//        System.out.println(taskOPerations.divoperation());
//
//        Oper oper = ((x,y)-> System.out.println(x+y+ " "));
//        oper.printToConsole(5,8);
//
//
//
//        int [] numbers = {1,20,55,44,5,9,7,55,44,77};
//int count = 0;
//        for (int number : numbers) {
//            if (number>10)
//                count++;
//
//        }
//        System.out.println(count);
//
//        Arrays.stream(numbers).filter(x->x>10)
//                .forEach(System.out::println);

            ArrayList<String> list=new ArrayList<>();
            list.add("hello");
            list.add("world");

            list.add("java");
            list.add("timon");
            list.add("dog");
            list.add("cat");
            list.add("pumba");

            list.stream().filter(string -> string.length()>4)
                    .forEach(System.out::println);

            int [] i = {1,5,99,88};
            // i stream for each

            Stream<String> word = Arrays.stream(new String[]{
                    "hello", "world", "java"
            });
            word.forEach(System.out::println);

            Stream<String> names = Stream.of("Vasya", "Pet", "Mish");
            names.filter(str->str.length()==5)
                    .forEach(System.out::println);

            //----------

            Stream<ProfessionStrream> professionStrreamStream =
                    Stream.of(new ProfessionStrream("java", 5000),
            new ProfessionStrream("C#", 2000),
                    new ProfessionStrream("Kotlin", 6000));

            professionStrreamStream.filter(prof->prof.getSalary()>4000)
                    .forEach(s -> System.out.println(s.getName()+ " "+s.getSalary()));


            Stream<ProfessionStrream> profession =Stream.of(new ProfessionStrream("java", 5000),
                    new ProfessionStrream("C#", 2000),
                    new ProfessionStrream("Kotlin", 6000));

            profession.map(ProfessionStrream::getSalary).forEach(System.out::println);

            Stream<ProfessionStrream> mapFlat = Stream.of(new ProfessionStrream("java", 5000),
                    new ProfessionStrream("C#", 2000),
                    new ProfessionStrream("Kotlin", 6000));

            mapFlat.flatMap(s->Stream.of(
                    String.format("yazik -> %s <--> zp seichas ->%d", s.getName(), s.getSalary()),
                    String.format("yazik -> %s zp spystya 1 god -> %d",
                    s.getName(), (s.getSalary()*2))
            ))
                    .forEach(System.out::println);


  }


}

