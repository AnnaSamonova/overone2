package samonova.lesson19.dz19;

public class Shark extends LivingEntity implements Swimable, Edible {

    String poroda;
    int lenght;
    boolean eat;

    Shark (String name, String poroda, int lenght) {
        super (name);
        this.lenght = lenght;
        this.poroda = poroda;
    }

    @Override
    void itIs() {
        super.itIs();
        System.out.println("рыба ");
    }

    @Override
    void saySaund() {
        System.out.println("мой звук - буль-буль");

    }


    @Override
    public boolean isEat() {
        System.out.println("Можно кушать? " + eat);
        if (eat == true)
            return true;
        else
            return false;
    }

    @Override
    public void needTocook() {
        System.out.println("Меня нужно приготовить, прежде чем кушать");

    }

    @Override
    public void IsSwim() {
        System.out.println("Да, я плаваю постоянно");

    }

    @Override
    public void distance() {
        System.out.println("На бесконечно большие расстояния");

    }
}
