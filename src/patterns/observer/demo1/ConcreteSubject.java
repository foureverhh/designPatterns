package patterns.observer.demo1;

public class ConcreteSubject extends Subject{
    private int state;

    public void setState(int state) {
        this.state = state;
        //State changes, notify all observers
        this.notifyAllObservers();
    }

    public int getState() {
        return state;
    }
}
