package org.example;

interface X {
    void show();
}

interface Y {
    void run();
}
//* class->class extends
//* class->interface implements
//* interface->interface extends

class A implements X, Y {

    @Override
    public void show() {
        System.out.println("show");
    }

    @Override
    public void run() {
        System.out.println("run");

    }
}

public class Demo3 {
    public static void main(String[] args) {
        A a = new A();
        a.show();
        a.run();
    }
}
