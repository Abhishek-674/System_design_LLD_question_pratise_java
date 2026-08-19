package RateLimiter;

public class FixedWindow implements RateLimiterAlgorithm{
    int limit;
    int windowSize;
    long previousTime;
    int count;
    public FixedWindow(int limit,int windowSize ) {
        this.limit = limit;
        this.previousTime = System.currentTimeMillis();
        this.count = 0;
        this.windowSize =windowSize;
    }
    @Override
    public boolean allowRequest()
    {
        if(System.currentTimeMillis() - previousTime >=windowSize)
        {
            count=0;
            previousTime = System.currentTimeMillis();
        }
        if(count>=limit)
        {
            return false;
        }
        count++;
        return true;
    }
}
