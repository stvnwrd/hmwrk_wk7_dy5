package Stock;

import Enums.InstrumentTypes;
import Interfaces.Playable;

public class Guitar extends Instrument implements Playable {

    int numberOfStrings;
    // left or right handed? set up enum


    public Guitar(String make, String model, double costPrice, double resalePrice, InstrumentTypes instrumentType, String material, String colour, int numberOfStrings) {
        super(make, model, costPrice, resalePrice, instrumentType, material, colour);
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public String play(Instrument instrument) {
        return null;
    }
}
