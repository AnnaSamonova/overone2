package samonova.lesson19.dz19;

public class Apple implements Edible{

    String name;
    boolean eat;

    public Apple (String name, boolean eat) {
        this.name =name;
        this. eat = eat;
    }


    @Override
    public boolean isEat() {
        System.out.println(name + " Можно кушать? " + eat);
        if (eat == true)
            return true;
        else
            return false;


    }

    @Override
    public void needTocook() {
        System.out.println("Меня можно кушать сырым и приготовленным");

    }
}
