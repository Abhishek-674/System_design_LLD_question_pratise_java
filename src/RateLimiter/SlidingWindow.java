package RateLimiter;

import java.util.LinkedList;
import java.util.Queue;

public class SlidingWindow implements RateLimiterAlgorithm {
    int limit;
    int windowSize;
    Queue<Long> request;
    public SlidingWindow(int limit, int windowSize) {
        this.limit = limit;
        this.windowSize = windowSize;
        request= new LinkedList<>();

    }
    @Override
    public boolean allowRequest() {

        while(!request.isEmpty()&&System.currentTimeMillis()-request.peek()>=windowSize){

            request.poll();
        }
        if(request.size()>=limit)
        {
            return false;
        }
        request.offer(System.currentTimeMillis());
        return true;

    }
}
