package Stock;

public abstract class Product {

    private String make;
    private String model;
    private double costPrice;
    private double resalePrice;

    public Product(String make, String model, double costPrice, double resalePrice) {
        this.make = make;
        this.model = model;
        this.costPrice = costPrice;
        this.resalePrice = resalePrice;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public double getResalePrice() {
        return resalePrice;
    }


}
