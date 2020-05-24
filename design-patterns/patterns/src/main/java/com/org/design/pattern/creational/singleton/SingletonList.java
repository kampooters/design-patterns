package com.org.design.pattern.creational.singleton;

import java.util.ArrayList;

/**
 * @author abdul.rehman4
 * @apiNote This class limits the object creation. Once the created objects reaches to the limit then new objects are not created
 *
 * Use Cases: This approach is normally used with POOL pattern to limit the created objects
 */
public class SingletonList {
    private static final int limit = 10;
    private final static ArrayList<SingletonList> singletonList = new ArrayList<>(limit);

    /**
     * private constructor controls the object accessibility.
     */
    private SingletonList(){}

    /**
     * Client can only access getInstance() method which always returns the object from created pool
     * @return
     */
    public SingletonList getInstance(){
        if(singletonList.size() < limit){
            SingletonList object = new SingletonList();
            singletonList.add(object);
        }
        return singletonList.get(1);
    }

    public ArrayList<SingletonList> getInstanceList(){
        return singletonList;
    }
}
