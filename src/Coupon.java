import java.util.ArrayList;

public class Coupon extends Special_offer{
    private final double min;
    private final Product product;
    private final double percent;
    public Coupon(double requirement, Product product, double percent){
        this.min = requirement;
        this.product = product;
        this.percent = percent;
    }
    @Override
    public boolean check_if_applies(ProductsList products) {
        return products.payment() >= this.min;
    }

    @Override
    public void apply_offer(ProductsList products) {
        ArrayList<Product> filtered = products.filterByCode(product.getCode());
        if (filtered.size()>0){
            double p = filtered.get(0).getDiscountPrize();
            filtered.get(0).setDiscountPrize(p*(1-.01*percent));
        }
    }
}
