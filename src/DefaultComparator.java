import java.util.Comparator;

public class DefaultComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        if (p1.getPrize() - p2.getPrize() != 0){
            return (int) (p1.getPrize() - p2.getPrize());
        }else{
            return p1.getName().compareToIgnoreCase(p2.getName());
        }

    }
}
