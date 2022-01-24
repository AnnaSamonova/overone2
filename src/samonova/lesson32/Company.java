package samonova.lesson32;

public class Company implements Comparable <Company> {
    @Override
    public int compareTo(Company company) {
        if (this.staff==company.staff) {
            return 0;
        }else if (this.staff<company.staff) {
            return -1;}
            else return 1;

    }

    int staff;
    int price;
    String city;
    boolean relocate;

    @Override
    public String toString() {
        return "Company---> " +
                "staff = " + staff +
                ", price = " + price +
                ", city=' " + city + '\'' +
                ", relocate= " + relocate;
    }

    public Company(int staff, int price, String city, boolean relocate) {
        this.staff = staff;
        this.price = price;
        this.city = city;
        this.relocate = relocate;



    }
}
