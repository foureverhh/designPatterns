package patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    //Store all observer
    protected List<Observer> list = new ArrayList<>();
    public void register(Observer obs){
        list.add(obs);
    }

    public void remove(Observer obs){
        list.remove(obs);
    }

    public void notifyAllObservers(){
        for (Observer observer : list){
            observer.update(this);
        }
    }
}
