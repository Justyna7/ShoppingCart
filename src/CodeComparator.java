import java.util.Comparator;

public class CodeComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return p1.getCode().compareTo(p2.getCode()) ;
    }
}
