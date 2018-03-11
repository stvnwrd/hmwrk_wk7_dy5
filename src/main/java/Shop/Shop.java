package Shop;

import Interfaces.Sellable;
import Stock.Keyboard;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<Sellable> stock;
    private double potentialProfit;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<>();
        this.potentialProfit = 0;
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

    public void removeStockFromShop(Sellable item) {
        this.stock.remove(item);
    }


    public double totalPotentialProfit(){
        for(Sellable item : stock){
            potentialProfit += item.calculateMarkUp();
        }
        return potentialProfit;
    }


}
