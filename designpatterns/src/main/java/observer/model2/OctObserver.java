package observer.model2;

public class OctObserver extends Observer {
    public OctObserver(Subject subject) {
        this.subject = subject;
        this.subject.add( this );
    }

    public void update() {
        System.out.print(" Oct Obserever: " + Integer.toOctalString(subject.getState()));
    }
}