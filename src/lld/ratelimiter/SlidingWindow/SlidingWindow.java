package lld.ratelimiter.SlidingWindow;

import lld.ratelimiter.RateLimiter;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class SlidingWindow implements RateLimiter {
    Queue<Long> slidingWindow;
    int timeWindowInSeconds;
    int bucketCapacity;

    public SlidingWindow(int timeWindowInSeconds, int bucketCapacity) {
        this.timeWindowInSeconds = timeWindowInSeconds;
        this.bucketCapacity = bucketCapacity;
        // non-blocking queue and thread safe
        this.slidingWindow = new ConcurrentLinkedQueue<>();
    }

    @Override
    public boolean grantAccess() {
        long currentTime = System.currentTimeMillis();
        checkAndUpdateQueue(currentTime);
        if (slidingWindow.size() < bucketCapacity) {
            slidingWindow.offer(currentTime);
            return true;
        }
        return false;
    }

//    5:41:30 , 5:41:36, 5:41:59, 5:42:10, 5:42:11 , 5:42:40

    private void checkAndUpdateQueue(long currentTime) {
        if (slidingWindow.isEmpty()) {
            return;
        }
        long calculatedTime = (currentTime - slidingWindow.peek()) / 1000;
        while (calculatedTime >= timeWindowInSeconds) {
            slidingWindow.poll();
            if (slidingWindow.isEmpty()) {
                break;
            }
            calculatedTime = (currentTime - slidingWindow.peek()) / 1000;
        }
    }
}
