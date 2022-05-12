import java.util.ArrayList;

public class NforM extends Special_offer{
    private final double min;
    private final int n;
    private final int m;
    public NforM(double requirement, int n, int m){
        this.min = requirement;
        this.n = n;
        this.m = m;
    }
    @Override
    public boolean check_if_applies(ProductsList products) {
        return false;
    }

    @Override
    public void apply_offer(ProductsList products) {

    }
}
