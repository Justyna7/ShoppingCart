import java.util.ArrayList;

public class Bargain extends Special_offer {
    private final double min;
    private final double percent;
    public Bargain(double requirement, double percent){
        this.min = requirement;
        this.percent = percent;
    }
    @Override
    public boolean check_if_applies(ProductsList products) {
        return true;
    }

    @Override
    public void apply_offer(ProductsList products) {
    }
}
