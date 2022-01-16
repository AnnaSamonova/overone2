package samonova.lessom30;

import java.sql.SQLOutput;

public class MyThread1 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+ "started...");
        try {
            Thread.sleep(500); // усыпляем поток
        } catch (InterruptedException e){
            System.err.println(e);
        }
        System.out.println(Thread.currentThread().getName() + " finished");
    }
}
