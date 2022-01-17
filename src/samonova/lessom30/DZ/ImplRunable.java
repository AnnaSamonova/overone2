package samonova.lessom30.DZ;

public class ImplRunable implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <=8 ; i++) {


    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        System.err.println(e);

    }
            System.out.println("With help runable" + Thread.currentThread() + " num i " + i);
    }

}}
