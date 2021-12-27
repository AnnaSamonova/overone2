package samonova.lesson19.dz19;

public class Main {
    public static void main(String[] args) {

        Apple apple = new Apple("яблоко", true);
        apple.isEat();
        apple.needTocook();
        System.out.println();


        Cat cat = new Cat("Кошка", "Сибирская");
        cat.itIs();
        cat.saySaund();
        cat.IsSwim();
        cat.distance();
        System.out.println();

        Chicken chicken = new Chicken("Курица", true);
        chicken.itIs();
        chicken.saySaund();
        chicken.isEat();
        chicken.needTocook();
        System.out.println();

        Shark shark = new Shark("Акула", "Тигровая", 100000);
        shark.itIs();
        shark.saySaund();
        shark.IsSwim();
        shark.distance();
        shark.isEat();
        shark.needTocook();
        System.out.println();

        Ship ship = new Ship("моторная лодка", 50);
        ship.IsSwim();
        ship.distance();



    }
}
