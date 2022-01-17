package samonova.lessom30.DZ;

public class Main {
    public static void main(String[] args) {

        new ExtendsThread("1й").start();
        new ExtendsThread("2й").start();
        new ExtendsThread("3й").start();
        new ExtendsThread("4й").start();
        new ExtendsThread("5й").start();
        new ExtendsThread("6й").start();
        new ExtendsThread("7й").start();
        new ExtendsThread("8й").start();

    //---------------------------------------------------------------------

        Thread tread1 = new Thread ( new ImplRunable(), "number 1");
        Thread tread2 = new Thread ( new ImplRunable(), "number 2");
        Thread tread3 = new Thread ( new ImplRunable(), "number 3");

        Thread tread4 = new Thread ( new ImplRunable(), "number 4");
        Thread tread5 = new Thread ( new ImplRunable(), "number 5");
        Thread tread6 = new Thread ( new ImplRunable(), "number 6");
        Thread tread7 = new Thread ( new ImplRunable(), "number 7");
        Thread tread8 = new Thread ( new ImplRunable(), "number 8");

        tread1.start();
        tread2.start();
        tread3.start();
        tread4.start();
        tread5.start();
        tread6.start();
        tread7.start();
        tread8.start();
    }
}
