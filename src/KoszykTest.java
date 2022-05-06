import org.junit.*; //
import static org.junit.Assert.assertEquals;

public class KoszykTest {
    @Test
    public void testEmpty() {
        // Arrange
        Koszyk sut = new Koszyk(); // sut = System Under Test
        // Assert
        assertEquals("sut.getProdukty().size()", 0, sut.getProdukty().size());
    }

    @Test
    public void testInitializeWithValue() {
        // Arrange
        Koszyk sut = new Koszyk(new Produkt(), new Produkt()); // sut = System Under Test
        // Assert
        assertEquals("sut.getProdukty().size()", 2, sut.getProdukty().size());
    }
    @Test
    public void testAddOne() {
        // Arrange
        Koszyk sut = new Koszyk(new Produkt());// sut = System Under Test
        // Act
        sut.add(new Produkt());
        // Assert
        assertEquals("sut.getProdukty().size()", 2, sut.getProdukty().size());
    }
    @Test
    public void testAddTwo() {
        // Arrange
        Koszyk sut = new Koszyk();// sut = System Under Test
        // Act
        sut.add(new Produkt(), new Produkt());
        // Assert
        assertEquals("sut.getProdukty().size()", 2, sut.getProdukty().size());
    }
    @Test
    public void testDeleteOne() {
        // Arrange
        Produkt a = new Produkt();
        Produkt b = new Produkt();
        Koszyk sut = new Koszyk(a,b);// sut = System Under Test
        // Act
        sut.del(a);
        // Assert
        assertEquals("sut.getProdukty().size()", 1, sut.getProdukty().size());
    }
    @Test
    public void testDoZaplaty() {
        // Arrange
        Koszyk sut = new Koszyk(new Produkt(), new Produkt()); // sut = System Under Test
        // Assert
        assertEquals("sut.do_zaplaty()", 2., sut.do_zaplaty(), 0.001);
    }
}
