package Stock;

import Enums.AccessoryTypes;

public class Accessory extends Product {

    private AccessoryTypes accessoryType;

    public Accessory(String make, String model, double costPrice, double resalePrice, AccessoryTypes accessoryType) {
        super(make, model, costPrice, resalePrice);
        this.accessoryType = accessoryType;
    }

    public AccessoryTypes getAccessoryType() {
        return accessoryType;
    }
}
