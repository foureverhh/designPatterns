package patterns.composite_275;

public class Client {
    public static void main(String[] args) {
        Folder f1;
        AbstractFile f2,f3,f4,f5,f6;
        f1 = new Folder("我的收藏");
        f2 = new ImageFile("老高的大头像.jpg");
        f3 = new TextFile("Hello.txt");
        f1.add(f2);
        f1.add(f3);
        f1.killVirus();
      /*  f2.killVirus();
        f3.killVirus();*/
        System.out.println();
        Folder f11 = new Folder("电影");
        f4 = new VideoFile("笑傲讲话.avi");
        f5 = new VideoFile("神雕侠侣.avi");
        f11.add(f4);
        f11.add(f5);
        f1.add(f11);
        f1.killVirus();
    }


}
