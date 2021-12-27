package samonova.lesson19.dz19;

public class Cat extends LivingEntity implements  Swimable{

    String poroda ;


    public Cat(String name, String poroda){
        super (name);
        this.poroda=poroda;

    }

    @Override
    void itIs() {
        super.itIs() ;
        System.out.println("Животное");
    }

    @Override
    void saySaund() {
        System.out.println("Я говорю мур-мяу");

    }



    @Override
    public void IsSwim() {
        System.out.println("Я могу плавать");

    }

    @Override
    public void distance() {
        System.out.println("И я могу проплыть 5 метров");

    }
}
