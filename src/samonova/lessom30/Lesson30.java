package samonova.lessom30;

public class Lesson30 {
    public static void main(String[] args) {

       /* Thread currentThread = Thread.currentThread();
        System.out.println(currentThread);*/ // посмотрели текущий поток
    /*new MyThread("Первый поток").start();
    new MyThread("Второй поток").start();
    new MyThread("Третий поток").start();
    new MyThread("Четвертый поток").start();*/

        /*for (int i = 1; i <= 5; i++) {
            new MyThread("Поток " + i)
*/

      //  }
        System.out.println(" Мэин поток запустился...");

        Thread myThread1 = new Thread(new MyThread1(),"MyTread1" );
        myThread1.start();
        System.out.println("Main закончился");


    }
}
