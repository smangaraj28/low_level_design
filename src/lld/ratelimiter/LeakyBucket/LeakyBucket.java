package lld.ratelimiter.LeakyBucket;

import lld.ratelimiter.RateLimiter;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class LeakyBucket implements RateLimiter {
    BlockingQueue<Integer> queue;

    public LeakyBucket(int capacity) {
        this.queue = new LinkedBlockingQueue<>(capacity);
    }

    @Override
    public boolean grantAccess() {
        try {
            this.queue.add(1);
        } catch (Exception e) {
            return false;
        }
        return true;
        // one request per request
//    public boolean grantAccess(int noOfRequests) {
//        if (this.queue.remainingCapacity() > 0) {
//            this.queue.add(1);
//            return true;
//        }
//        return false;
    }
}
