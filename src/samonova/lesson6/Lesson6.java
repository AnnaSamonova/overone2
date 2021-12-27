package samonova.lesson6;

public class Lesson6 {
    public static void main(String[] args) {
/*int x= 6;
while   (x>0) {
    System.out.println("значение х = " + x);
    x--;
}*/
        /*int x=-1;
        do {
            System.out.println("значение х = " + x);
            x--;
        }
        while (x>0);*/

// вывести четные
     /*   int i = 10;
        while (i <= 20) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }*/
// вывести от 10 до 1
        /*int i =10;
        while (i>=1) {
            System.out.print(i+ " ");
            i--;
        }*/
// вывести число в обратном порядке
        /*int i=547;
        while (i<=745) {
            if (i==745){
                System.out.println(i);
            }
            i++;
        }*/

       /* int i = 547;
        int k = 0;
        while (i > 0) {
            k = i % 10;
            System.out.print(k);
            i = i / 10;
        }*/

        //вывести последовательность от 2 до10204 что бы все было больше в 2 раз
        /*int i=1;
        while (i<1024) {
            i=i*2;
            System.out.println(i);
        }*/
        //вывести максим и минимум
        /*int number = 5434856;
        int min = 9;
        int max = 0;
        while (number > 0) {
            if (min > number % 10) {
                min = number % 10;

            }
            if (max < number % 10) {
                max = number % 10;
            }
            number=number/10;
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);*/

        // среднее из всех цифр числа
       /* int number = 542588;
        int count = 0;
        double sum = 0;
        double result = 0;
        while (number > 0) {
            sum = sum + number % 10;
            count++;
            number = number / 10;
        }
        result = sum / count;
        System.out.println(result);*/

        //вывести цифры по убыванию
        int number = 34567821;
        int k = 0;

        while (number > 0) {
            if (number % 10 - (number % 100) / 10 == 1) {
                k++;
                if (k == 1) {
                    System.out.println(number % 10);
                    System.out.println((number % 100) / 10);
                } else {
                    System.out.println((number % 100) / 10);
                }
            } else {
                k = 0;
            }
            number=number/10;

        }

    }
}

