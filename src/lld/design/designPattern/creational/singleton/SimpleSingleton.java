package lld.design.designPattern.creational.singleton;

// Eagerly Initialised
public class SimpleSingleton {

    // static member
    private static final SimpleSingleton instance = new SimpleSingleton();

    // private constructor
    private SimpleSingleton() {

    }
    // static method
    public static SimpleSingleton getInstance() {
        return instance;
    }
}

class StaticSingleton {
    private static StaticSingleton instance;

    private StaticSingleton() {
        System.out.println("fdafafdadf");
    }

    static {
        System.out.println("qrqereqrqer");
        instance = new StaticSingleton();
    }

    {
        System.out.println("fadfadfaf fadjlhl");
    }

    public static StaticSingleton getInstance() {
        return instance;
    }
}

class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {

    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}


class SynchronizedSingleton {
    private static SynchronizedSingleton instance;

    private SynchronizedSingleton() {
    }

    public static synchronized SynchronizedSingleton getInstance() {
        if (instance == null) {
            instance = new SynchronizedSingleton();
        }
        return instance;
    }
}

class OptimisedThreadSafeSingleton {
    private static OptimisedThreadSafeSingleton instance;

    private OptimisedThreadSafeSingleton() {

    }

//    T1 -> instance 9:42

//    T2 -> 9:45

    // Double Checking
    public static OptimisedThreadSafeSingleton getInstance() {
        if (instance == null) { //  T1, T2
            synchronized (OptimisedThreadSafeSingleton.class) { // T1 will enter , T2 has to wait
                if (instance == null) {
                    instance = new OptimisedThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}


class SingletonBillPugh {
    private SingletonBillPugh() {

    }

    private static class SingleHelper {
        private static final SingletonBillPugh INSTANCE = new SingletonBillPugh();
    }

    public static SingletonBillPugh getInstance() {
        return SingleHelper.INSTANCE;
    }
}

enum Singleton {
    SINGLETON;

    static {
    }
    Singleton() {
    }
    public static Singleton getInstance() {
        return SINGLETON;
    }
}

