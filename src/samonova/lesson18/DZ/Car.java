package samonova.lesson18.DZ;

public class Car extends Transport{
    boolean isFlying;

    public boolean isFlying() {
        return isFlying;
    }

    public void setFlying(boolean flying) {
        isFlying = flying;
    }


    public Car(String name, String model, int numberOfWheels, boolean isFlying) {
        super(name, model, numberOfWheels);
        this.isFlying = isFlying;
    }

    @Override
    public void saySound() {
        System.out.println("Машина сигналит бип-бип");
    }

    @Override
    public void about() {
        super.about();
        System.out.println("Умеет ли летать? " + isFlying);
    }
}
