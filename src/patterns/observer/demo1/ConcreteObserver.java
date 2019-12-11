package patterns.observer.demo1;

public class ConcreteObserver implements Observer{
    private int myState;


    @Override
    public void update(Subject subject) {
        myState = ((ConcreteSubject) subject).getState();
    }

    public void setMyState(int myState) {
        this.myState = myState;
    }

    public int getMyState() {
        return myState;
    }
}
