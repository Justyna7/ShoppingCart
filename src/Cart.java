//package .;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Cart {
    private ProductsList products = new ProductsList();
    public ArrayList<Special_offer> offers = new ArrayList<>();
    public Cart() {}
    public Cart(ProductsList products){
        this.products = products;
    }
    public Cart(ArrayList<Special_offer> offers, ProductsList products){
        this.products = products;
        this.offers = offers;
    }

    public ArrayList<Product> getProducts() { return products.getProducts(); }
    public void add(Product...products) { this.products.add(products); }
    public void del(Product...products){ this.products.del(products); }

    public void sortByPrize(boolean ascending) { this.products.sortByPrize(ascending); }
    public void sortByName(boolean ascending){ this.products.sortByName(ascending); }

    public Product minPrize(){ return this.products.minPrize(); }
    public ArrayList<Product> minPrize(int n){ return this.products.minPrize(n); }
    public Product maxPrize(){ return this.products.maxPrize(); }
    public ArrayList<Product> maxPrize(int n){ return this.products.maxPrize(n); }

    public void add(Special_offer...offers){ Collections.addAll(this.offers, offers); }
    public void del(Special_offer...offers){ for (Special_offer o:offers){ this.offers.remove(o);} }

    public double payment(){
        double procent = 1;

        for (Special_offer offer:this.offers){
            if(offer.check_if_applies(this.products)){
                offer.apply_offer(this.products);
                if(offer.bargain_for_all){
                    procent = procent * (1-offer.getPercent());
                }
            }
            //System.out.println(this.products.getProducts().size());
        }

        return this.products.payment() * procent;
    }
}