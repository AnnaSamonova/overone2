package samonova.lesson31.DZ;

public class Emploee <T>{

   private T tabelNum;

    public void addTabel(T tabelNum) {
        this.tabelNum = tabelNum;

    }

    public T getTabelNum() {
        return tabelNum;
    }

    public void print () {
        System.out.println( "табельный номер -  " + getTabelNum());
    }
}
