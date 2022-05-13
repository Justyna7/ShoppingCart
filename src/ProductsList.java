import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

public class ProductsList {
    private ArrayList<Product> products = new ArrayList<Product>();

    public ArrayList<Product> getProducts() {
        return products;
    }
    public ProductsList(Product...products){
        this.products.addAll(Arrays.asList(products));
        this.defaultSort();
    }

    public void add(Product...products){
        Collections.addAll(this.products, products);
        this.defaultSort();
    }

    public void del(Product...products){
        for (Product p:products){ this.products.remove(p); }
        this.defaultSort();
    }

    public void sortByPrize(boolean ascending) {
        this.products.sort(new PrizeComparator());
        if (!ascending) { Collections.reverse(this.products); }
    }

    public void sortByName(boolean ascending){
        this.products.sort(new NameComparator());
        if (!ascending){ Collections.reverse(this.products); }
    }

    public void defaultSort(){
        this.products.sort(new DefaultComparator());
    }
    public Product minPrize(){
        this.sortByPrize(true);
        return this.products.get(0);
    }

    public ArrayList<Product> minPrize(int n){
        this.sortByPrize(true);
        ArrayList<Product> x = new ArrayList<>();
        for (int i = 0; i < n; i++){
            x.add(this.products.get(i));
        }
        return x;
    }

    public Product maxPrize(){
        this.sortByPrize(false);
        return this.products.get(0);
    }

    public ArrayList<Product> maxPrize(int n){
        this.sortByPrize(false);
        ArrayList<Product> x = new ArrayList<>();
        for (int i = 0; i < n; i++){
            x.add(this.products.get(i));
        }
        return x;
    }

    public double payment(){
        double payment = 0;
        for (Product p:this.products){
            payment = payment + p.getDiscountPrize();
        }
        return payment;
    }

    public ArrayList<Product> filterByCode(String code){
        ArrayList<Product> x = new ArrayList<>();
        for (int i = 0; i <this.products.size() ; i++){
            if (this.products.get(i).getCode().equals(code)) {
                x.add(this.products.get(i));
            }
        }
        return x;
    }
}
