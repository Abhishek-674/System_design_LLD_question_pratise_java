package Logger;

public class Warning extends LogHandler{

    @Override
    public void handle(LoggerType type, String msg)
    {
        if(type == LoggerType.WARNING)
        {
            System.out.println("[Warning]"+msg);
        }
        else
        {
            nxt.handle(type, msg);
        }
    }
}
