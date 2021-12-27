package samonova.Lesson15;

public class GetSum {
    // вернуть сумму от 1 числа до другого

    public int getSum (int a, int b){
        int summa =0;
        for (int i = a; i <=b ; i++)
        {
            summa = summa+i;

        }
        return summa;
    }
}
