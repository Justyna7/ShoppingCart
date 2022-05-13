import java.util.ArrayList;

public class NforM extends Special_offer{
    private final int n;
    private final int m;
    public NforM(int n, int m){
        this.n = n;
        this.m = m;
    }
    @Override
    public boolean check_if_applies(ProductsList products) {
        return products.getProducts().size() >= n;
    }

    @Override
    public void apply_offer(ProductsList products) {
        int count_all_iterations = products.getProducts().size()/n;
        int count_free = (n-m)*count_all_iterations;
        ArrayList<Product> free_items = products.minPrize(count_free);
        for (Product p:free_items){
            p.setDiscountPrize(0);
        }

    }
}
