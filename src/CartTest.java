import org.junit.*; //
import static org.junit.Assert.assertEquals;

public class CartTest {
    @Test
    public void testEmpty() {
        // Arrange
        Cart sut = new Cart(); // sut = System Under Test
        // Assert
        assertEquals("sut.getProdukty().size()", 0, sut.getProdukty().size());
    }

    @Test
    public void testInitializeWithValue() {
        // Arrange
        Cart sut = new Cart(new Product(), new Product()); // sut = System Under Test
        // Assert
        assertEquals("sut.getProdukty().size()", 2, sut.getProdukty().size());
    }
    @Test
    public void testAddOne() {
        // Arrange
        Cart sut = new Cart(new Product());// sut = System Under Test
        // Act
        sut.add(new Product());
        // Assert
        assertEquals("sut.getProdukty().size()", 2, sut.getProdukty().size());
    }
    @Test
    public void testAddTwo() {
        // Arrange
        Cart sut = new Cart();// sut = System Under Test
        // Act
        sut.add(new Product(), new Product());
        // Assert
        assertEquals("sut.getProdukty().size()", 2, sut.getProdukty().size());
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
        assertEquals("sut.getProdukty().size()", 1, sut.getProdukty().size());
    }
    @Test
    public void testDoZaplaty() {
        // Arrange
        Cart sut = new Cart(new Product(), new Product()); // sut = System Under Test
        // Assert
        assertEquals("sut.do_zaplaty()", 2., sut.do_zaplaty(), 0.001);
    }
}
