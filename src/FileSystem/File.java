package FileSystem;

public class File extends FileSystem{
    public File(String name){
        super(name);
    }
    @Override
    void ls()
    {
        System.out.println(this.name);
    }

}
