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

}
