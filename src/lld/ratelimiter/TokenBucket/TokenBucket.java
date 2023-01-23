package lld.ratelimiter.TokenBucket;

import lld.ratelimiter.RateLimiter;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class TokenBucket implements RateLimiter {
    // bucket
    // refresh rate (1 sec -> 10 requests )
    private int bucketCapacity;
    private int refreshRate;
    private AtomicInteger currentCapacity; // thread safe
    private AtomicLong lastUpdatedTime;

//    s1 -> 10 , 12 requests ->

    public TokenBucket(int bucketCapacity, int refreshRate) {
        this.bucketCapacity = bucketCapacity;
        this.refreshRate = refreshRate;
        currentCapacity = new AtomicInteger(bucketCapacity);
        lastUpdatedTime = new AtomicLong(System.currentTimeMillis());
    }

    @Override
    public boolean grantAccess() {
        refreshBucket();
        if (currentCapacity.get() > 0) {
            currentCapacity.decrementAndGet();
            return true;
        }
        return false;
    }

//    5:00 - 5:01 -> 10
//    5;01 - 5:02 -> 10

    public void refreshBucket() {
        long currentTime = System.currentTimeMillis();
        int additionalToken = (int) (currentTime - lastUpdatedTime.get()) / 1000 * refreshRate;
        int currCapacity = Math.min(currentCapacity.get() + additionalToken, bucketCapacity);
        currentCapacity.getAndSet(currCapacity);
        lastUpdatedTime.getAndSet(currentTime);
    }
}
