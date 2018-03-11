import Enums.InstrumentTypes;
import Stock.Keyboard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestKeyboard {

    Keyboard keyboard;

    @Before
    public void setUp() throws Exception {
        keyboard = new Keyboard("Moog", "Voyager XL", 3800.00, 4900.00, InstrumentTypes.KEYBOARD, "Mixed", "Mahogany / Black", 61);
    }

    @Test
    public void canGetName() {
        assertEquals("Moog", keyboard.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("Voyager XL", keyboard.getModel());
    }

    @Test
    public void canGetCostPrice() {
        assertEquals(3800.00, keyboard.getCostPrice(), 0.01);
    }

    @Test
    public void canGetResalePrice() {
        assertEquals(4900.00, keyboard.getResalePrice(), 0.01);
    }

    @Test
    public void canGetInstrumentType() {
        assertEquals(InstrumentTypes.KEYBOARD, keyboard.getInstrumentType());
    }

    @Test
    public void canGetMaterial() {
        assertEquals("Mixed", keyboard.getMaterial());
    }

    @Test
    public void canGetColour() {
        assertEquals("Mahogany / Black", keyboard.getColour());
    }

    @Test
    public void canGetNumberOfKeys() {
        assertEquals(61, keyboard.getNumberOfKeys());
    }

    @Test
    public void canPlay() {
        assertEquals("Bleep bloop, this Moog Voyager XL is quality.", keyboard.play());
    }

    @Test
    public void canCalculateMarkUp() {
        assertEquals(1100.00, keyboard.calculateMarkUp(), 0.01);
    }
}
