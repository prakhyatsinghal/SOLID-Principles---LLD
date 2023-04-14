
import org.junit.Test;
import static org.junit.Assert.*;

public class PenthouseTest {

    @Test
    public void testSetSquareFootage() {
        Penthouse penthouse = new Penthouse();
        penthouse.setSquareFootage(2000);
        assertEquals(2000, penthouse.squareFootage);
    }

    @Test
    public void testAddBedroom() {
        Penthouse penthouse = new Penthouse();
        penthouse.addBedroom();
        assertEquals(5, penthouse.numberOfBedrooms);
    }

}
