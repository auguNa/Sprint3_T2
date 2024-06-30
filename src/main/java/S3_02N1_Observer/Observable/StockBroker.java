package S3_02N1_Observer.Observable;

import S3_02N1_Observer.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class StockBroker implements Observable {
    private List<Observer> observers;
    private String stockMarketStatus;

    public StockBroker() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(stockMarketStatus);
        }
    }
    public void setStockMarketStatus(String stockMarketStatus) {
        this.stockMarketStatus = stockMarketStatus;
        notifyObservers();
    }
}
