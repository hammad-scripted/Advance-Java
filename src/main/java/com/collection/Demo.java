package com.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Demo {

    static void main() {
        Collection c = new ArrayList();
        c.add(1);
        c.add(2);

        for (Object x : c) {
            System.out.println(x);
        }

        Collection<Integer> c2 = new ArrayList<Integer>();
        c2.add(10);
        c2.add(20);

        for (int n : c2) {
            System.out.println(n);
        }

    }
}
