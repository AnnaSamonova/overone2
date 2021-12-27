package samonova.lesson19.dz19;

public abstract  class LivingEntity {

    private String name;

   public  LivingEntity (String name) {
       this.name =name;}

    public String getName (){
       return name;
    }

    public void setName (String name) {
       this.name=name;
    }

     void itIs () {
         System.out.println(toString() );
     }

    @Override
    public String toString() {
        return getName() + " -  это ";

    }
    abstract void saySaund ();
}

