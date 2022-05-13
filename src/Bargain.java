import java.util.ArrayList;

public class Bargain extends Special_offer {
    private final double min;
    private final double percent;
    public Bargain(double requirement, double percent){
        super.bargain_for_all = true;
        this.min = requirement;
        this.percent = percent;
    }
    @Override
    public double getPercent() { return percent * 0.01; }

    @Override
    public boolean check_if_applies(ProductsList products) {
        return products.payment() >= this.min;
    }
    @Override
    public void apply_offer(ProductsList products) {}
}
