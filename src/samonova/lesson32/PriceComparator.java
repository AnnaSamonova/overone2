package samonova.lesson32;

import java.util.Comparator;

public class PriceComparator implements Comparator <Company >{
    @Override
    public int compare(Company o1, Company o2) {
        if(o1.price==o2.price){
            return 0;
        }
        if (o1.price> o2.price){
            return 1;
        } else

        return -1;
    }
}
