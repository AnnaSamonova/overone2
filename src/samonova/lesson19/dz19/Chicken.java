package samonova.lesson19.dz19;

public class Chicken extends LivingEntity implements Edible {


    boolean eat;

  public Chicken ( String name, boolean eat) {
      super (name);
      this.eat = eat;

  }

    @Override
    void itIs() {
        super.itIs();
        System.out.println( "птица");

    }

    @Override
    void saySaund() {
        System.out.println("Мой звук - ко-ко-ко");
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
        System.out.println("Что бы скушать, меня нужно приготовить");

    }
}
