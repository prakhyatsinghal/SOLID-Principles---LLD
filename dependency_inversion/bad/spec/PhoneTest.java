import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PhoneTest {
    @Test
    public void testGeneratesAlertString() {
        Phone phone = new Phone();
        assertEquals("It is rainy", phone.generateWeatherAlert("rainy"));
    }
}
