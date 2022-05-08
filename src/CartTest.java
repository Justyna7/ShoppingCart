import org.junit.*; //
import static org.junit.Assert.assertEquals;

public class CartTest {
    @Test
    public void testEmpty() {
        // Arrange
        Cart sut = new Cart(); // sut = System Under Test
        // Assert
        assertEquals("sut.getProducts().size()", 0, sut.getProducts().size());
    }

    @Test
    public void testInitializeWithValue() {
        // Arrange
        Cart sut = new Cart(new Product(), new Product()); // sut = System Under Test
        // Assert
        assertEquals("sut.getProducts().size()", 2, sut.getProducts().size());
    }
    @Test
    public void testAddOne() {
        // Arrange
        Cart sut = new Cart(new Product());// sut = System Under Test
        // Act
        sut.add(new Product());
        // Assert
        assertEquals("sut.getProducts().size()", 2, sut.getProducts().size());
    }
    @Test
    public void testAddTwo() {
        // Arrange
        Cart sut = new Cart();// sut = System Under Test
        // Act
        sut.add(new Product(), new Product());
        // Assert
        assertEquals("sut.getProducts().size()", 2, sut.getProducts().size());
    }
    @Test
    public void testDeleteOne() {
        // Arrange
        Product a = new Product();
        Product b = new Product();
        Cart sut = new Cart(a,b);// sut = System Under Test
        // Act
        sut.del(a);
        // Assert
        assertEquals("sut.getProducts().size()", 1, sut.getProducts().size());
    }
    @Test
    public void testPayment() {
        // Arrange
        Cart sut = new Cart(new Product("aaa", "p1", 12), new Product("aab", "p2", 3)); // sut = System Under Test
        // Assert
        assertEquals("sut.payment()", 15, sut.payment(), 0.001);
    }
    @Test
    public void testSortByPrizeAscending() {
        // Arrange
        Cart sut = new Cart(new Product("aaa", "p1", 12), new Product("aab", "p2", 3), new Product("aac", "p3", 13)); // sut = System Under Test
        // Act
        sut.sortByPrize(false);
        // Assert
        assertEquals("sut.getProducts().get(0).getName()", "p2", sut.getProducts().get(0).getName());
    }
    @Test
    public void testSortByPrizeDescending() {
        // Arrange
        Cart sut = new Cart(new Product("aaa", "p1", 12), new Product("aab", "p2", 3), new Product("aac", "p3", 13)); // sut = System Under Test
        // Act
        sut.sortByPrize(true);
        // Assert
        assertEquals("sut.getProducts().get(0).getName()", "p3", sut.getProducts().get(0).getName());
    }
    @Test
    public void testSortByNameAscending() {
        // Arrange
        Cart sut = new Cart(new Product("aaa", "paczka", 12), new Product("aab", "aligator", 38), new Product("aac", "woda", 13)); // sut = System Under Test
        // Act
        sut.sortByName(false);
        // Assert
        assertEquals("sut.getProducts().get(0).getName()", "aligator", sut.getProducts().get(0).getName());
    }
    @Test
    public void testSortByNameDescending() {
        // Arrange
        Cart sut = new Cart(new Product("aaa", "paczka", 12), new Product("aab", "aligator", 38), new Product("aac", "woda", 13)); // sut = System Under Test
        // Act
        sut.sortByName(true);
        // Assert
        assertEquals("sut.getProducts().get(0).getName()", "woda", sut.getProducts().get(0).getName());
    }

}
