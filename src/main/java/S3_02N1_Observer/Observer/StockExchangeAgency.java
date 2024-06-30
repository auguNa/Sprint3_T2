package S3_02N1_Observer.Observer;

public class StockExchangeAgency implements Observer {
    private String name;

    public StockExchangeAgency(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockMarketStatus) {
        System.out.println("Stock Exchange Agency " + name + " received stock market update: " + stockMarketStatus);

    }
}
