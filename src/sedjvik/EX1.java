package sedjvik;

public class EX1 {
    public static void main(String[] args) {

//        1.2.2. Напишите программу, которая использует Math.sin() и Math.cos() и проверяет,
//        что значение cos20 + sin20 равно приблизительно 1 для любого значения 0,
//                переданного в аргументе командной строки. Просто выведите значение. Почему
//        оно не всегда в точности равно 1?
        /*double t = Double.parseDouble(args[0]);
       double ans= ( Math.pow(Math.sin(t), Math.sin(t))) + (Math.pow(Math.cos(t),Math.cos(t)));
        System.out.println(ans);*/
      /*  char zz= 'b';
        char c= 'c';
        char a = 'a';
        System.out.println((char) ('a'+4));*/


       /* int f = 2147483647;
        System.out.println(2*f);*/


       /* double p = 3.14159;
        System.out.println((int)(8/p));*/

        //1.2.13. Определите результат выражения (M a t h .s q r t ( 2 ) * M a t h .s q r t ( 2 ) == 2 ).
        /*boolean bb =(Math.sqrt(2) *Math.sqrt(2)==2);
        System.out.println(bb);*/

//        //1.2.14. Напишите программу, которая получает два положительных числа в аргументах
//       // командной строки и выводит t r u e , если одно из этих чисел нацело делится
//      //  на другое.

/*int a= Integer.parseInt(args[0]);
int n =Integer.parseInt(args[1]);
if((a%n==0)||(n%a==0)) {
    System.out.println(true);
}
else System.out.println(false);*/

//        1.2.15. Напишите программу, которая получает три положительных числа в аргументах
//        командной строки и выводит f a ls e , если одно из них больше или равно
//        сумме других, или t r u e в противном случае. (Примечание: программа проверяет,
//        могут ли числа представлять длины сторон некоторого треугольника.)
       /* int q =Integer.parseInt(args[0]);
        int w =Integer.parseInt(args[1]);
        int r =Integer.parseInt(args[2]);
        if ((q>=(w+r))||((w>=q+r)) || (r>=(q+w)))
            System.out.println(false);
        else System.out.println(true);*/

//        1.2.18. Напишите программу, которая получает два числа с плавающей точкой х и у
//        в аргументах командной строки и выводит евклидово расстояние от точки (х, у)
//        до точки (0,0).

      /*double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);

        double z = Math.sqrt((Math.pow(x,2)) +(Math.pow(y,2))) ;
        System.out.println(z);*/

//        1.2.19. Напишите программу, которая получает два целых числа а и b в аргументах
//        командной строки и выводит случайное целое число из диапазона от а до b включительно.
        /*int a = Integer.parseInt(args[0]);
        int b= Integer.parseInt(args[1]);

        double v = (Math.random()*(b-a)) +a;

        System.out.println(v);
*/


//        1.2.20. Напишите программу, которая выводит сумму двух случайных чисел от 1 до
//        6 (такие результаты могут быть получены при броске кубиков).

        /*int a=(int) (Math.random()*6+1);
        int b=(int) (Math.random()*6+1);
        int v = a+b;
        System.out.println(a + " + " + b + " = " + v);
*/


    }
}
