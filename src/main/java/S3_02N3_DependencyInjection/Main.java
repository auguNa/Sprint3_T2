package S3_02N3_DependencyInjection;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CurrencyConverter currencyConverter = new CurrencyConverter();

        Item item1 = new Item("Laptop", 1000, "USD");
        Item item2 = new Item("Phone", 800, "USD");
        Item item3 = new Item("Tablet", 500, "USD");

        Shop shop = new Shop(Arrays.asList(item1, item2, item3), currencyConverter);

        shop.displayPricesInCurrency("EUR");
        shop.displayPricesInCurrency("JPY");
        shop.displayPricesInCurrency("GBP");
    }
}
