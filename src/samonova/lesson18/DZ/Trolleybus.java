package samonova.lesson18.DZ;

public class Trolleybus extends Transport{

    int seating;

     public int getSeating() {
         return seating;
     }
     public void setSeating (int seating) {
         this.seating=seating;
     }

    public Trolleybus (String name, String model, int numberOfWheels , int seating){
        super (name,model, numberOfWheels);
        this.seating = seating;
    }
    @Override
    public  void saySound () {
        System.out.println("Троллейбус сигналит - бииииии бииииииииии");
    }

    @Override
    public void about(){
         super.about();
        System.out.println("количество сидячик мест: " + getSeating());

    }
}
