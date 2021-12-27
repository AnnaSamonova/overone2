package samonova.lesson16;
//3. Написать функцию, которая получает координаты 2 точек на плоскости и
//        возвращает расстояние между ними.
public class Ex3 {

    public static void main(String[] args) {
        System.out.println(xY(4,2, 2, -2));

    }

    public static double xY (double x1, double y1, double x2, double y2) {
        double katetX = x2-x1;
        double katetY = y2 -y1;
        double gipotenuza =Math.sqrt (Math.pow(katetX, 2) + Math.pow(katetY, 2));
        return gipotenuza;
    }


}
