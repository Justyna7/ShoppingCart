import java.util.Comparator;

public class PrizeComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return (int) (p1.getPrize() - p2.getPrize());
    }
}
