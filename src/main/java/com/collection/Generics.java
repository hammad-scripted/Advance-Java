package com.collection;


public class Generics {
    static void main() {

        Box<String> box = new Box<>("Hammad");
        Box<Integer> box2 = new Box<>(22);
        System.out.println(box.getValue());
        System.out.println(box2.getValue());
        System.out.println(box);
        System.out.println(box2);


    }
}
