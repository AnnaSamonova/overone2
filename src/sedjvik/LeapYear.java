package sedjvik;

public class LeapYear {
    public static void main(String[] args) {
        // Листинг 1.2.4. Високосный год
        int year = Integer.parseInt(args[0]);
        boolean isLeapYear;
        isLeapYear = (year % 4 == 0);
        isLeapYear = isLeapYear && (year % 100 != 0);
        isLeapYear = isLeapYear || (year / 400 == 0);
        System.out.println(isLeapYear);


    }
}
