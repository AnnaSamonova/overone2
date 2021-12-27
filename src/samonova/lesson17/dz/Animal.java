package samonova.lesson17.dz;

public class Animal {
    private String name = "///";
    private int legs = 0;

    public String getName () {
        return name;

    }

    public void setName (String name) {
        this.name = name;
    }

    public void isName (String imya) {
        imya = name;
        System.out.println(imya);

    }

    public int getLegs() {
        return legs;
    }




    public void say ( String say1) {
        System.out.println(say1); }

      public   Animal (String name) {
            this.name = name;
        }
    public void setLegs(int legs) {
        this.legs = legs;
    }

   public Animal (String name, int legs) {
        this.name =name;
        this.legs = legs;
   }
    public Animal () {

    }


    }

