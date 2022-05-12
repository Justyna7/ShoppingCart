//package .;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// dodawanie/ usuwanie można zrobić systemowo
// napisać własne porównywanie
public class Cart {
    private ProductsList products = new ProductsList();
//    private ArrayList<Product> products = new ArrayList<Product>();
//    public ArrayList<Product> getProducts() {
//        return products;
//    }
    public ArrayList<Special_offer> offers = new ArrayList<Special_offer>();
    public ArrayList<Product> getProducts() {
        return products.getProducts();
    }
    public Cart(ArrayList<Special_offer> offers, ProductsList products){
        this.products = products;
        this.offers = offers;
//        for (Product p:products){
//            this.products.add(p);
//        }
    }
    public Cart(ProductsList products){
//        for (Product p:products){
//            this.products.add(p);
//        }
        this.products = products;
    }

    public Cart() {

    }
    public void add(Product...products) { this.products.add(products); }
    public void del(Product...products){ this.products.del(products); }
    public void sortByPrize(boolean ascending) { this.products.sortByPrize(ascending); }
    public void sortByName(boolean ascending){ this.products.sortByName(ascending); }
    public Product minPrize(){ return this.products.minPrize(); }
    public  ArrayList<Product> minPrize(int n){ return this.products.minPrize(n); }
    public Product maxPrize(){ return this.products.maxPrize(); }
    public  ArrayList<Product> maxPrize(int n){ return this.products.maxPrize(n); }


    //    public void add(Product...products){
//        for (Product p:products){
//            this.products.add(p);
//        }
//    }
//    public void del(Product...products){
//        for (Product p:products){
//            this.products.remove(p);
//        }
//    }
    public double payment(){
        double payment = 0;
        for (Special_offer offer:this.offers){
            if(offer.check_if_applies(this.products)){
                offer.apply_offer(this.products);
            }
        }
        for (Product p:this.products.getProducts()){
            payment = payment + p.getPrize();
        }
        return payment;
    }

//    public void sortByPrize(boolean ascending) {
//        this.products.sort(new PrizeComparator());
//        if (!ascending) {
//            Collections.reverse(this.products);
//        }
//    }
//
//    public void sortByName(boolean ascending){
//        this.products.sort(new NameComparator());
//        if (!ascending){
//            Collections.reverse(this.products);
//        }
//    }
//    public Product minPrize(){
//        this.sortByPrize(true);
//        return this.products.get(0);
//    }
//    public ArrayList<Product> minPrize(int n){
//        this.sortByPrize(true);
//        ArrayList<Product> x = new ArrayList<>();
//        for (int i = 0; i < n; i++){
//            x.add(this.products.get(i));
//        }
//        return x;
//    }
//    public Product maxPrize(){
//        this.sortByPrize(false);
//        return this.products.get(0);
//    }
//    public ArrayList<Product> maxPrize(int n){
//        this.sortByPrize(false);
//        ArrayList<Product> x = new ArrayList<>();
//        for (int i = 0; i < n; i++){
//            x.add(this.products.get(i));
//        }
//        return x;
//    }

}