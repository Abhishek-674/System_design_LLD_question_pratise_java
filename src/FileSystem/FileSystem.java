package FileSystem;

public abstract class FileSystem {
    String name;
    public FileSystem(String name){
        this.name=name;
    }

    void ls()
    {

    }
    void rename(String newName)
    {
        this.name=newName;
    }


}
