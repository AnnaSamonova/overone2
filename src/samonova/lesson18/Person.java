package samonova.lesson18;

public abstract class Person {
    private String name;




    public void setName (String name) {
       this.name = name;
    }

     public String getName () {
        return name;

     }

     public Person (String name) {
        this.name = name;
     }

    public abstract void print ();

    }
