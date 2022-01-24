package samonova.lesson32;

import java.util.ArrayList;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        //  сравним в трисэт --- тут у нас ситуация с ошибкой, тк трисэт не знает по чем сортировать ( мы е имплементировали компарбл)
       /* TreeSet<Company> companyTreeset = new TreeSet<>();
        Company company = new Company(150, 180000, "Berlin", true);
        companyTreeset.add(company);
*/


        // ----------------  тут уже переопределили компэаТу

       /* Company oneCcompany = new Company(150, 180000, "Berlin", true);
        Company twoCcompany = new Company(49, 190000, "Minsk", false);
        Company threeCcompany = new Company(1500, 280000, "USA", true);
        Company fourCcompany = new Company(50, 680000, "Austria", true);

        TreeSet <Company> companyTreeS = new TreeSet<>();
        companyTreeS.add(oneCcompany);
        companyTreeS.add(twoCcompany);
        companyTreeS.add(threeCcompany);
        companyTreeS.add(fourCcompany);

        for (Company companyTr : companyTreeS) {
            System.out.println(companyTr);

        }*/
// ---------------------  тут имплементим компаратор

        ArrayList <Company> companyArList = new ArrayList<>();
        Company oneCcompany = new Company(150, 180000, "Berlin", true);
        Company twoCcompany = new Company(49, 110000, "Minsk", false);
        Company threeCcompany = new Company(1500, 280000, "USA", true);
        Company fourCcompany = new Company(50, 680000, "Austria", true);

        companyArList.add(oneCcompany);
        companyArList.add(twoCcompany);
        companyArList.add(threeCcompany);
        companyArList.add(fourCcompany);

        for (Company comp : companyArList) {
            System.out.println(comp);

        }

        // ----------------- у нас в эррэйлисте просто выводится без сортировки, привязываемся к классу прайскомпаратор

        PriceComparator pricecomparator = new PriceComparator();
        companyArList.sort(pricecomparator); // принемает на вход объект класса прайс компаратор, который реализует компэа

        System.out.println("Отсортированный эррэйлист ");
        for (Company co : companyArList) {
            System.out.println(co);

        }
    }
}
