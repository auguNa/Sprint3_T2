package S3_02N3_DependencyInjection;

public class Item {
    private String name;
    private double price;
    private String currency;

    public Item(String name, double price, String currency) {
        this.name = name;
        this.price = price;
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCurrency() {
        return currency;
    }
}
