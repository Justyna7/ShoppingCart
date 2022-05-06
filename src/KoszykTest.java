import org.junit.*; //
import static org.junit.Assert.assertEquals;

public class KoszykTest {
    @Test
    public void testEmpty() {
        // Arrange
        // sut = System Under Test
        Koszyk sut = new Koszyk();
        // Act
        // Assert
        assertEquals("sut.getProdukty().size()", 0, sut.getProdukty().size());
    }
}
