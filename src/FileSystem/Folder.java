package FileSystem;

import java.util.ArrayList;
import java.util.List;

public class Folder extends FileSystem{
    List<FileSystem> children;
    public Folder(String name){
        super(name);
        children=new ArrayList<FileSystem>();
    }

    @Override
    void ls()
    {
        System.out.println(this.name+ "/");
        for(FileSystem fs:children)
        {
            fs.ls();
        }
    }
    void addFile(FileSystem fs)
    {
        children.add(fs);
    }
    void deleteFile(FileSystem fs)
    {
        children.remove(fs);
    }

}
