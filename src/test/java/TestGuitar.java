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
    public void getMake() {
        assertEquals("Fender", guitar.getMake());
    }

    @Test
    public void getModel() {
        assertEquals("Telecaster", guitar.getModel());
    }
}
