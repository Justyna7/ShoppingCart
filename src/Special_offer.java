import java.util.ArrayList;

public abstract class Special_offer implements SpecialOffer {
    @Override
    public abstract boolean check_if_applies(ProductsList products);
    @Override
    public abstract void apply_offer(ProductsList products);
    public boolean bargain_for_all = false;
    @Override
    public double getPercent() {
        return 1;
    }
}
