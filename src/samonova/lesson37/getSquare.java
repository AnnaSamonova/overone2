package samonova.lesson37;

public class getSquare {
    public static void main(String[] args) {

        Isharp tiangle = () -> 0.5*5*6;
        Isharp cyrcle = ()-> Math.PI*Math.pow(3,2);
        Isharp square = () -> Math.pow(6,2);

        System.out.println(tiangle.getSquere());
        System.out.println(cyrcle.getSquere());
        System.out.println(square.getSquere());

    }
}
