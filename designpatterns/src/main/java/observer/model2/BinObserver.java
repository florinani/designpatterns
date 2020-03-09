package observer.model2;

public class BinObserver extends Observer {
    public BinObserver(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

    public void update() {
        System.out.print(" Bin Obserever: " + Integer.toBinaryString(subject.getState()));
    }
}
