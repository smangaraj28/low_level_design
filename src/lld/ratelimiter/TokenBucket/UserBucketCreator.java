package lld.ratelimiter.TokenBucket;

import java.util.HashMap;
import java.util.Map;

// Identify user from ip address, name of the user, user id
public class UserBucketCreator {
    // for each user we have one bucket
    Map<Integer, TokenBucket> bucket;

    public UserBucketCreator(int id) {
        bucket = new HashMap<>();
        bucket.put(id, new TokenBucket(10, 10));
    }

    public void accessApplication(int id) {
        if (bucket.get(id).grantAccess()) {
//            System.out.println(" -> able to access the application");
            System.out.println(Thread.currentThread().getName() + " -> able to access the application");
        } else {
//            System.out.println(" Too many request, Please try after sometime");
            System.out.println(Thread.currentThread().getName() + " Too many request, Please try after sometime");
        }
    }
}
