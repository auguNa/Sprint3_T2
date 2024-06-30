package S3_02N1_Observer;

import S3_02N1_Observer.Observable.StockBroker;
import S3_02N1_Observer.Observer.StockExchangeAgency;

public class Main {
    public static void main(String[] args) {
        StockBroker stockBroker = new StockBroker();

        StockExchangeAgency agency1 = new StockExchangeAgency("Agency1");
        StockExchangeAgency agency2 = new StockExchangeAgency("Agency2");
        StockExchangeAgency agency3 = new StockExchangeAgency("Agency3");

        stockBroker.addObserver(agency1);
        stockBroker.addObserver(agency2);
        stockBroker.addObserver(agency3);

        stockBroker.setStockMarketStatus("Market is up");
        stockBroker.setStockMarketStatus("Market is down");
    }
}
