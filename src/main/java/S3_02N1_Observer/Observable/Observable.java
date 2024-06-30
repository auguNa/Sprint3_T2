package S3_02N1_Observer.Observable;

import S3_02N1_Observer.Observer.Observer;

public interface Observable {

    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
