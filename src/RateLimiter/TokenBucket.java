package RateLimiter;

import static java.lang.Math.min;

public class TokenBucket implements RateLimiterAlgorithm{
    int limit;
    Long previousTime;
    int fillingRate;
    int token;
    public TokenBucket(int limit, int fillingRate){
        this.limit = limit;
        this.previousTime=System.currentTimeMillis();
        this.fillingRate=fillingRate;
        this.token=0;
    }
    @Override
    public boolean allowRequest() {
        Long timewindow=System.currentTimeMillis()-previousTime;
        token=min(limit,token+(int)(timewindow/fillingRate));

        if(token>=1){
            return true;
        }
        return false;


    }
}
