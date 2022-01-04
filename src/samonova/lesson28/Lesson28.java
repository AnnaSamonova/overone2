package samonova.lesson28;

public class Lesson28 {
    public static void main(String[] args) {
        /*
        try {  тут код и ловим исключение
        }

        catch { обрабатываем}

        finaly {работает всегдаб было ли или нет поймано или нет исключение}
         */

//Exception0 exception0= new Exception0();
double result=0;
//result=exception0.divNumber(5,0);
        //System.out.println("result "+ result);



        /*Exception1 exception1 = new Exception1();
        result = exception1.divNum(6,0);
        System.out.println("result "+ result);*/

        /*Exception2 exception2 = new Exception2();
        result = exception2.divNumb(6,2);
        System.out.println("result "+ result);*/

        double [] a = {1.3, 1.4, 1.5, 5.6};
        double [] b = {1.0, 0.0, 2.0};
        double [] c;

        DivisionArrays divisionArrays = new DivisionArrays(4, a, 3, b);
        c=divisionArrays.division();

        for (int i = 0; i < c.length; i++) {
            System.out.println("a --> " + i + " = " + c[i]);


        }
    }

}
