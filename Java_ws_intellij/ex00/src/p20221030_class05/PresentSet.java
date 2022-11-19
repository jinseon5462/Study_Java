package p20221030_class05;

import java.util.ArrayList;

public class PresentSet {
    ArrayList<Product> list;
    public PresentSet(Product p1, Product p2, Product p3){
        list = new ArrayList<Product>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
    }

    public int getPrice(){
        int totalPrice = list.get(0).price + list.get(1).price + list.get(2).price;
        return totalPrice;
    }
}