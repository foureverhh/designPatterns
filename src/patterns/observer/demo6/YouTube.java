package patterns.observer.demo6;
//https://youtu.be/98DiwRp-KZk
public class YouTube {
    public static void main(String[] args) {
        Channel telusko = new Channel("telusko");

        Subscriber subscriber1 = new Subscriber("s1");
        Subscriber subscriber2 = new Subscriber("s2");
        Subscriber subscriber3 = new Subscriber("s3");
        Subscriber subscriber4 = new Subscriber("s4");
        Subscriber subscriber5 = new Subscriber("s5");
        Subscriber subscriber6 = new Subscriber("s6");

        subscriber1.subscribeChannel(telusko);
        subscriber2.subscribeChannel(telusko);
        subscriber3.subscribeChannel(telusko);
        subscriber4.subscribeChannel(telusko);
        subscriber5.subscribeChannel(telusko);
        subscriber6.subscribeChannel(telusko);

        telusko.uploadNewProgram("java course");
        System.out.println(subscriber1.getChannel().getName());
        System.out.println(subscriber1.getProgramTitle());
        System.out.println(subscriber3.getChannel().getName());
        System.out.println(subscriber3.getProgramTitle());

    }
}
