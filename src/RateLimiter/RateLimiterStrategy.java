package RateLimiter;

public class RateLimiterStrategy {
    RateLimiterAlgorithm rateLimiterAlgorithm;
    void setRateLimiterStrategy(RateLimiterAlgorithm rateLimiterAlgorithm) {
        this.rateLimiterAlgorithm = rateLimiterAlgorithm;
    }
    boolean requestApi()
    {
        return rateLimiterAlgorithm.allowRequest();
    }
}
