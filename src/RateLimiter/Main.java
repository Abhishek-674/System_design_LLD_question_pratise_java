package RateLimiter;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        RateLimiterStrategy rateLimiterStrategy =
                new RateLimiterStrategy();
//        rateLimiterStrategy.setRateLimiterStrategy(new FixedWindow(8, 20000));

//        for (int i = 1; i <= 10; i++) {
//
//            if (rateLimiterStrategy.requestApi()) {
//                System.out.println("Request " + i + " : Allowed");
//            } else {
//                System.out.println("Request " + i + " : Rejected");
//            }
//        }


        rateLimiterStrategy.setRateLimiterStrategy(new SlidingWindow(5,1000));



        for (int i = 1; i <= 10; i++) {
            System.out.println(
                    "Request " + i + " : " + rateLimiterStrategy.requestApi()
            );
        }

        // 6th request
        System.out.println(
                "Request 11 : " + rateLimiterStrategy.requestApi());

        // Wait for 10 seconds
        Thread.sleep(10000);

        // New window
        System.out.println(
                "After 10 seconds : " + rateLimiterStrategy.requestApi()
        );

    }
}