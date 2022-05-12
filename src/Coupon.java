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
        return false;
    }

    @Override
    public void apply_offer(ProductsList products) {

    }
}
