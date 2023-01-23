package lld.ratelimiter.LeakyBucket;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
Perform Rate limiting logic for provided customer ID

Return True if the request, request is allowed and false if it is not
boolean rateLimit(int customerID)
 */
public class Main {

    public static void main(String[] args) {
        // serial requests
        // One bucket per one user
        UserBucketCreator userBucketCreator = new UserBucketCreator(1);
//        for (int i = 0; i < 12; i++) {
//            userBucketCreator.accessApplication(1);
//        }
//          parallel Requests
        ExecutorService executors = Executors.newFixedThreadPool(12);
        for (int i = 0; i < 12; i++) {
            executors.execute(() -> userBucketCreator.accessApplication(1));
        }
        executors.shutdown();
    }
}
