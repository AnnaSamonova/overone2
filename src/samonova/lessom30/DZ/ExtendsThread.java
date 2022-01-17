package samonova.lessom30.DZ;

public class ExtendsThread extends  Thread {

    public ExtendsThread (String number) {
        super(number);
    }

    @Override
    public void run() {


        for (int i = 1; i <= 8; i++) {

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.err.println(e);
            }

            System.out.println("name " + this.getName() + " priority " + getPriority() + " number " + i);
        }

    }


}
