package observer.model2;

public class HexObserver extends Observer {
    public HexObserver(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

    public void update() {
        System.out.print(" Hex Obserever: " + Integer.toHexString(subject.getState()));
    }
}
