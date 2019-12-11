package patterns.observer.demo2;

import java.util.Observable;

public class ConcreteSubject extends Observable {
    private int state;

    public void set(int s){
        //Target state changed
        state = s;
        //Set state change flag to be true
        setChanged();
        //Notify all observers
        notifyObservers(state);
    }

    public int getState() {
        return state;
    }

}
