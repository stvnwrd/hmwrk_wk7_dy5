import Enums.InstrumentTypes;
import Stock.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestGuitar {

    Guitar guitar;

    @Before
    public void setUp() throws Exception {
        guitar = new Guitar("Fender", "Telecaster", 400.00, 500.00, InstrumentTypes.GUITARS, "Alder and Maple", "Brown Sunburst", 6 );
    }

    @Test
    public void canGetMake() {
        assertEquals("Fender", guitar.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("Telecaster", guitar.getModel());
    }

    @Test
    public void canGetCostPrice() {
        assertEquals(400.00, guitar.getCostPrice(), 0.01);
    }

    @Test
    public void canGetResalePrice() {
        assertEquals(500.00, guitar.getResalePrice(), 0.01);
    }

    @Test
    public void canGetInstrumentType() {
        assertEquals(InstrumentTypes.GUITARS, guitar.getInstrumentType());
    }

    @Test
    public void canGetMaterial() {
        assertEquals("Alder and Maple", guitar.getMaterial());
    }

    @Test
    public void canGetColour() {
        assertEquals("Brown Sunburst", guitar.getColour());
    }

    @Test
    public void canGetNumberOfStrings() {
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void canPlayGuitar() {
        assertEquals("Brrrrunnnng. While my Telecaster gently weeps...", guitar.play());
    }
}
