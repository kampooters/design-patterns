package com.org.design.pattern.creational.singleton;

/**
 * @author abdul.rehman4
 * @apiNote This class provides only one instance per application context.
 * Client can only access the exposed static method
 */
public class Singleton {
    private static Singleton singleton = new Singleton();

    /**
     * private constructor controls the object accessibility.
     */
    private Singleton(){}

    /**
     * Client can only access getInstance() method which always returns the single object
     * @return
     */
    public Singleton getInstance(){
        return singleton;
    }
}
