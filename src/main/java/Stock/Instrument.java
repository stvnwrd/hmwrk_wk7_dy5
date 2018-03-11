package Stock;

import Enums.InstrumentTypes;

public abstract class Instrument extends Product{

    private InstrumentTypes instrumentType;
    private String material;
    private String colour;

    public Instrument(String make, String model, double costPrice, double resalePrice, InstrumentTypes instrumentType, String material, String colour) {
        super(make, model, costPrice, resalePrice);
        this.instrumentType = instrumentType;
        this.material = material;
        this.colour = colour;
    }

    public InstrumentTypes getInstrumentType() {
        return instrumentType;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }
}
