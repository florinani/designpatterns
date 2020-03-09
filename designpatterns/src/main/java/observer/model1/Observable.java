package observer.model1;

public interface Observable {

    void attach(Observer observer);

    void remove(Observer observer);

    void nottifyAllObservers();

}
