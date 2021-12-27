package samonova.lesson18.DZ;

public class Tank extends Transport{

    int km;
    int katki ;

     public Tank(String name, String model, int numberOfWheels, int km, int katki) {
        super (name, model, numberOfWheels);
        this.km = km;
        this.katki =katki;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public int getKatki() {
        return katki;
    }

    public void setKatki(int katki) {
        this.katki = katki;
    }

    @Override
    public void saySound() {
        System.out.println( "Танк стреляет");
    }

    @Override
    public void about() {
        super.about();
        System.out.println("У танка вместо колес катки, по " + getKatki() + " штук с каждой стороны");
        System.out.println("Дальность стрельбы, км: " + getKm());



    }
}
