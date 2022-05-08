//package .;


import java.util.ArrayList;

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
}