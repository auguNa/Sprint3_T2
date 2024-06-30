package S3_02N3_DependencyInjection;

import java.util.List;

public class Shop {
    private List<Item> items;
    private CurrencyConverter currencyConverter;

    public Shop(List<Item> items, CurrencyConverter currencyConverter) {
        this.items = items;
        this.currencyConverter = currencyConverter;
    }

    public void displayPricesInCurrency(String targetCurrency) {
        System.out.println("Prices in " + targetCurrency + ":");
        for (Item item : items) {
            double convertedPrice = currencyConverter.convert(item.getCurrency(), targetCurrency, item.getPrice());
            System.out.printf("%s: %.2f %s\n", item.getName(), convertedPrice, targetCurrency);
        }
    }
}
