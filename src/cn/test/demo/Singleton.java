package cn.test.demo;

public class Singleton {

    /**
     * 饿汉模式,是线程安全的
     */
//    private final static Singleton singleton = new Singleton();
//
//    private Singleton() {}
//
//    public static Singleton getSingleton() {
//        return singleton;
//    }

    /**
     * 懒汉模式,非线程安全的
     */
    private static Singleton singleton;

    private Singleton() {}

    public static Singleton getSingleton() {
        if (null == singleton) {
            singleton = new Singleton();
        }
        return singleton;
    }

}
