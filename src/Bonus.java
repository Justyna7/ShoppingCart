import java.util.ArrayList;

public class Bonus extends Special_offer{
    private final double min;
    private final Product product;
    public Bonus(double requirement, Product product){
        this.min = requirement;
        this.product = product;
    }
    @Override
    public boolean check_if_applies(ProductsList products) {
        return false;
    }

    @Override
    public void apply_offer(ProductsList products) {

    }
}
