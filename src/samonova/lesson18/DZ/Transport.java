package samonova.lesson18.DZ;

public abstract class Transport {
    String name;
    String model;
    int numberOfWheels;

    //  создали конструктор

    public Transport (String name , String model, int numberOfWheels) {
        this.model = model;
        this. numberOfWheels = numberOfWheels;
        this.name = name;
    }


    // создаем get and set

    public String getModel () {
        return model;
    }

    public void setModel (String model) {
        this.model=model;
    }

    public int getValueOfWheels () {
        return numberOfWheels;
    }

    public void setNumberOfWheels (int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // создали абстрактный метод
    public abstract void saySound ();

    // создали обычный метод
    public void about () {
        System.out.println("Название транспорта: " + getName() + '\n' +
                 "модель: " + getModel() + '\n' +
                "кол-во колес : " + getValueOfWheels() );
    }


}
