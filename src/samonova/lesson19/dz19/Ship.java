package samonova.lesson19.dz19;

public class Ship implements Swimable{

    String model;
    int lenght;
    Ship (String model, int lenght) {
        this.lenght = lenght;
        this.model = model;
    }

    @Override
    public void IsSwim() {
        System.out.println( model +" плавает ");

    }

    @Override
    public void distance() {
        System.out.println("И проплывает " + lenght + " км");

    }
}
