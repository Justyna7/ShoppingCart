import java.util.ArrayList;

public interface SpecialOffer {
    boolean check_if_applies(ProductsList products);
    void apply_offer(ProductsList products);
}
