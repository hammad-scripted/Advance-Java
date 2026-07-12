package org.example;


@FunctionalInterface
interface W {
    void show();
}

interface
Addition {
    public int add(int a, int b);
}

public class Demo5 {
    static void main() {

//? anyomous inner class
        W w = new W() {

            @Override
            public void show() {
                System.out.println("this is a anomoyous inner class");
            }

        };

//        ! lambda expression
        W w1 = () -> {
            System.out.println("this is a lambda expression");
        };

        w.show();
        w1.show();

        Addition ex = new Addition() {
            @Override
            public int add(int a, int b) {
                return a + b;
            }
        };
        System.out.println(ex.add(1230,343));


    }
}
