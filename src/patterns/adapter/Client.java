package patterns.adapter;
//用户
public class Client {
    public void test1(Target t){
        t.handleReq();
    }

    public static void main(String[] args) {
        Client client = new Client();
        Target adapter = new Adapter();
        //Adapter adapter = new Adapter();
        client.test1(adapter);

        Target adapter2 = new Adapter2(new Adaptee());
        //Adapter2 adapter2 = new Adapter2(new Adaptee());
        client.test1(adapter2);
    }
}
