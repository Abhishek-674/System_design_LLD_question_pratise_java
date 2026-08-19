package Logger;

public class Logger {
    LogHandler logHandler;
    public Logger()
    {
       LogHandler info=new Info();
       LogHandler warning=new Warning();
       LogHandler error=new Error();
       info.setNext(warning);
       warning.setNext(error);
       logHandler=info;
    }

    void log(LoggerType type,String message)
    {
        logHandler.handle(type,message);
    }
}
