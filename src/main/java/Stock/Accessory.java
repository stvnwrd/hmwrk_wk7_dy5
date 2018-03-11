package Stock;

import Enums.AccessoryTypes;
import Interfaces.Sellable;

public class Accessory extends Product implements Sellable{

    private AccessoryTypes accessoryType;

    public Accessory(String make, String model, double costPrice, double resalePrice, AccessoryTypes accessoryType) {
        super(make, model, costPrice, resalePrice);
        this.accessoryType = accessoryType;
    }

    public AccessoryTypes getAccessoryType() {
        return accessoryType;
    }

    @Override
    public double calculateMarkUp() {
        return (getResalePrice() - getCostPrice());
    }
    
}
