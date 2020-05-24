package com.org.collection;

import java.util.*;

public class CollectionSample {
    public static void main(String [] args){
        String key = "abdul";
        int abdulHash = key.hashCode();
        int ludbaHash = "ludba".hashCode();
        int ladbuHash = "ladbu".hashCode();
        HashMap<String, String> stringHashMap = new HashMap<>();
        for (int i=0; i< 17; i++){
            stringHashMap.put(String.valueOf(i), "a1"+String.valueOf(i));
        }

        stringHashMap.put("b", "a11");

        String val = stringHashMap.get("h");
        System.out.println(val);
//        HashSet<Object> objects = new HashSet<>();
//        objects.add()
//        objects.
//                Hashtable
//                Queue
//        Stack
//                Map
//        List
//                Vector
    }
}
