package patterns.composite_275;

import java.util.ArrayList;
import java.util.List;

public interface AbstractFile {
    void killVirus();
}

class ImageFile implements AbstractFile{
    private String fileName;

    public ImageFile(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void killVirus() {
        System.out.println("Killing virus in "+this.getClass().getSimpleName()+" : "+fileName);
    }
}

class TextFile implements AbstractFile{
    private String fileName;

    public TextFile(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void killVirus() {
        System.out.println("Killing virus in "+this.getClass().getSimpleName()+" : "+fileName);
    }
}

class VideoFile implements AbstractFile{
    private String fileName;

    public VideoFile(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void killVirus() {
        System.out.println("Killing virus in "+this.getClass().getSimpleName()+" : "+fileName);
    }
}


class Folder implements AbstractFile{
    private String fileName;
    //定义容器，用来存放本容器下的各种子节点
    private List<AbstractFile> list = new ArrayList<>();

    public Folder(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void killVirus() {
        System.out.println("Killing virus in "+this.getClass().getSimpleName()+" : "+fileName);
        for (AbstractFile file:list){
            file.killVirus();
        }
    }

    void add(AbstractFile file){
        list.add(file);
    }

    void remove(AbstractFile file){
        list.remove(file);
    }

    AbstractFile getChild(int index){
        return list.get(index);
    }
}