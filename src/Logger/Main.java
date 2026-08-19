package Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger=new Logger();
        logger.log(LoggerType.INFO,"Hello World");
        logger.log(LoggerType.ERROR,"Hello error");
        logger.log(LoggerType.WARNING,"Hello warmning");
    }
}
