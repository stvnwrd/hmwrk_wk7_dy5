package Stock;

import Enums.InstrumentTypes;
import Interfaces.Playable;

public class Keyboard extends Instrument implements Playable {

    int numberOfKeys;

    public Keyboard(String make, String model, double costPrice, double resalePrice, InstrumentTypes instrumentType, String material, String colour, int numberOfKeys) {
        super(make, model, costPrice, resalePrice, instrumentType, material, colour);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    @Override
    public String play() {
        return "Bleep bloop, this " + getMake() + " " + getModel() + " is quality.";
    }
}
