package samonova.lesson18.DZ;

public class Plain extends Transport {

    String forWath; // типо для каких целей служит

    public String getForWath() {
        return forWath;
    }

    //  первым делом перегружаем конструктор родительского кл

    public Plain(String name , String model, int numberOfWheels, String forWath) {
        super(name , model, numberOfWheels);
        this.forWath = forWath;
    }

    // теперь нужно реализовать абстрактный метод
    @Override
    public void saySound() {
        System.out.println("У самолёта нет гудка");
    }
 // теперь можем переопределить простой метод родительского класса


    @Override
    public void about() {
        super.about();
        System.out.println("Предназначение: " + getForWath());
    }
}

