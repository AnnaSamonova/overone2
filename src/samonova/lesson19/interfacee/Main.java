package samonova.lesson19.interfacee;

public class Main {
    public static void main(String[] args) {
Fly plane = new Plane ("Boing", 27);
Fly bee =new Bee (3);

Fly [] mas = {plane, bee};
        for (Fly object : mas) {
            object.fly();

        }
    }
}
