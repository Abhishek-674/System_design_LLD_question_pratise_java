package Logger;

public abstract class LogHandler {
    LogHandler nxt;

    public void handle(LoggerType type, String msg)
    {

    }
    void setNext(LogHandler nxt) {
        this.nxt = nxt;
    }

}
