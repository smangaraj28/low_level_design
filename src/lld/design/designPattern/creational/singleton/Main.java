package lld.design.designPattern.creational.singleton;

import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) {
        SimpleSingleton instance1 = SimpleSingleton.getInstance();
        SimpleSingleton instance2 = null;

        // Reflection APIs


        try {
            Constructor[] str = SimpleSingleton.class.getDeclaredConstructors();
            for (Constructor constructor : str) {
                // setting constructor accessible
                constructor.setAccessible(true);
                instance2 = (SimpleSingleton) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());

    }
}
