package FileSystem;

public class Main {
    public static void main(String[] args) {
        Folder root=new Folder("root");
        File f1=new File("f1");
        File f2=new File("f2");
        File f3=new File("f3");
        Folder f4=new Folder("f4");
        File f5=new File("f5");
        root.addFile(f1);
        root.addFile(f2);
        root.addFile(f3);
        root.addFile(f4);
        f4.addFile(f5);
        f1.rename("resume");
        root.ls();
        root.deleteFile(f1);
        root.ls();
    }
}

// try to learn path handling in this
