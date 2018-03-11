import Enums.AccessoryTypes;
import Enums.InstrumentTypes;
import Stock.Accessory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAccessory {

    Accessory accessory;

    @Before
    public void setUp() throws Exception {
        accessory = new Accessory("Ernie Ball", "Super Slinky", 4.50, 6.00, AccessoryTypes.GUITAR_STRINGS);
    }

    @Test
    public void canGetMake() {
        assertEquals("Ernie Ball", accessory.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("Super Slinky", accessory.getModel());
    }

    @Test
    public void canGetCostPrice() {
        assertEquals(4.50, accessory.getCostPrice(), 0.01);
    }

    @Test
    public void canGetResalePrice() {
        assertEquals(6.00, accessory.getResalePrice(), 0.01);
    }

    @Test
    public void canGetAccessoryType() {
        assertEquals(AccessoryTypes.GUITAR_STRINGS, accessory.getAccessoryType());
    }

    @Test
    public void canCalculateMarkUp() {
        assertEquals(1.50, accessory.calculateMarkUp(), 0.01);
    }
}
