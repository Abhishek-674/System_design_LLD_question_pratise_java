package Logger;

public class Error extends LogHandler
{

    public void handle(LoggerType type, String msg)
    {
        if(type == LoggerType.ERROR)
        {

            System.out.println("[Error]"+msg);
        }
        else {
            System.out.println("No handler found");
        }
    }
}
