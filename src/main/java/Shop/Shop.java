package Shop;

import Interfaces.Sellable;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<Sellable> stock;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int totalStock() {
        return this.stock.size();
    }

    public void addStockToShop(Sellable item) {
        this.stock.add(item);
    }
}
