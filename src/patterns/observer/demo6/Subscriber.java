package patterns.observer.demo6;

public class Subscriber {
    private String name;
    private Channel channel;
    private String programTitle;
    public Subscriber(String name) {
        this.name = name;
    }

    public void update(){
        System.out.println("Video Upload!");
        this.programTitle = channel.getProgramTitle();
    }

    public void subscribeChannel(Channel channel){
        this.channel = channel;
        channel.subscribe(this);
    }

    public String getName() {
        return name;
    }

    public Channel getChannel() {
        return channel;
    }

    public String getProgramTitle() {
        return programTitle;
    }
}
