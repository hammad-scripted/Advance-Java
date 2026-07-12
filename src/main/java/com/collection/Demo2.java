package com.collection;

import java.util.HashMap;
import java.util.Map;

public class Demo2 {
    static void main() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");

        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key);
            System.out.println(value);
        }
        System.out.println(map.keySet());
        System.out.println(map.values());
    }
}
