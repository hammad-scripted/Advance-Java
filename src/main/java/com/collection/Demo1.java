package com.collection;

import java.util.HashSet;
import java.util.Set;

public class Demo1 {

    static void main() {
        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");

        for (String s : set) {
            System.out.println(s);
        }
//? set removes duplicate values but it does not give guarantee of order
        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(12);
        set2.add(8000);
        set2.add(231);
        for (Integer i : set2) {
            System.out.println(i);
        }
    }
}
