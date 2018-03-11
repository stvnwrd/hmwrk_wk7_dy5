import Enums.AccessoryTypes;
import Enums.InstrumentTypes;
import Shop.Shop;
import Stock.Accessory;
import Stock.Guitar;
import Stock.Keyboard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestShop {

    Shop shop;
    Guitar guitar;
    Accessory accessory;
    Keyboard keyboard;

    @Before
    public void setUp() throws Exception {
        shop = new Shop("The Euphonium Emporium");
        guitar = new Guitar("Fender", "Telecaster", 400.00, 500.00, InstrumentTypes.GUITAR, "Alder and Maple", "Brown Sunburst", 6 );
        accessory = new Accessory("Ernie Ball", "Super Slinky", 4.50, 6.00, AccessoryTypes.GUITAR_STRINGS);
        keyboard = new Keyboard("Moog", "Voyager XL", 3800.00, 4900.00, InstrumentTypes.KEYBOARD, "Mixed", "Mahogany / Black", 61);

    }

    @Test
    public void canGetName() {
        assertEquals("The Euphonium Emporium", shop.getName());
    }

    @Test
    public void checkTotalStockDefaultsToZero() {
        assertEquals(0, shop.totalStock());
    }

    @Test
    public void checkAddStock() {
        shop.addStockToShop(guitar);
        shop.addStockToShop(keyboard);
        shop.addStockToShop(accessory);
        assertEquals(3, shop.totalStock());
    }
}
