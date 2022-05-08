//package .;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// dodawanie/ usuwanie można zrobić systemowo
// napisać własne porównywanie
public class Cart {
    private ArrayList<Product> products = new ArrayList<Product>();
    public ArrayList<Product> getProducts() {
        return products;
    }
    public Cart(Product...products){
        for (Product p:products){
            this.products.add(p);
        }
    }
    public void add(Product...products){
        for (Product p:products){
            this.products.add(p);
        }
    }
    public void del(Product...products){
        for (Product p:products){
            this.products.remove(p);
        }
    }
    public double payment(){
        double payment = 0;
        for (Product p:this.products){
            payment = payment + p.getPrize();
        }
        return payment;
    }


    public void sortByPrize(boolean ascending){
        this.products.sort(new PrizeComparator());
        if (ascending){
            Collections.reverse(this.products);
        }
    }
    public void sortByName(boolean ascending){
        this.products.sort(new NameComparator());
        if (ascending){
            Collections.reverse(this.products);
        }
    }

}