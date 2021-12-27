package samonova.lesson18.DZ;

public class Main {
    public static void main(String[] args) {

        Transport plain = new Plain("Самолёт", "Су-15", 3, "истребитель-перехватчик");
        plain.about();
        plain.saySound();
        System.out.println();

        Transport tank = new Tank("Танк", "Т-34", 0, 6, 5);
        tank.about();
        tank.saySound();
        System.out.println();

        Transport car = new Car("Машина", "Ауди А100", 4, false);
        car.about();
        car.saySound();
        System.out.println();

        Transport trolleybus = new Trolleybus("Троллейбус", "Белкоммунмаш АКСМ-321б", 4, 26) ;
        trolleybus.about();
        trolleybus.saySound();

    }
}
