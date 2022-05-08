//package .;


import java.util.ArrayList;

// dodawanie/ usuwanie można zrobić systemowo
// napisać własne porównywanie
public class Cart {
    private ArrayList<Product> produkty = new ArrayList<Product>();
    public ArrayList<Product> getProdukty() {
        return produkty;
    }
    public Cart(Product...produkty){
        for (Product p:produkty){
            this.produkty.add(p);
        }
    }
    public void add(Product...produkty){
        for (Product p:produkty){
            this.produkty.add(p);
        }
    }
    public void del(Product...produkty){
        for (Product p:produkty){
            this.produkty.remove(p);
        }
    }
    public float do_zaplaty(){
        return 0;
    }
}