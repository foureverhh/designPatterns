package patterns.observer.demo6;

import java.util.ArrayList;
import java.util.List;

public class Channel {
    private String programTitle;
    private List<Subscriber> subscribers = new ArrayList<>();
    private String name;

    public Channel(String name) {
        this.name = name;
    }

    public void subscribe(Subscriber subscriber){
        subscribers.add(subscriber);
    }

    public void unScribe(Subscriber subscriber){
        subscribers.remove(subscriber);
    }

    public void notifyAllSubscribers(){
        for(Subscriber subscriber : subscribers){
            subscriber.update();
        }
    }

    public void uploadNewProgram(String title){
        this.programTitle = title;
        notifyAllSubscribers();
    }

    public String getProgramTitle() {
        return programTitle;
    }

    public String getName() {
        return name;
    }
}
