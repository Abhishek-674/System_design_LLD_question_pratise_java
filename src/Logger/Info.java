package Logger;

public class Info extends LogHandler{

    public void handle(LoggerType type, String msg)
    {
        if(type == LoggerType.INFO)
        {
            System.out.println("[INFO] " + msg);
        }
        else
            nxt.handle(type, msg);
    }
}
