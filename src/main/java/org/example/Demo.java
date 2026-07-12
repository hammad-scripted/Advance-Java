package org.example;


class Outer {
    private int x = 10;

    class Inner {
        void display() {
            System.out.println("x = " + x);
        }
    }
}
class Outer2 {
    static class StaticNested{
        void show(){
            System.out.println("show");
        }
    }
}

public class Demo {

    public static void main(String[] args) {
        Outer outer=new Outer();
        Outer.Inner inner=outer.new Inner();
        inner.display();

        Outer2.StaticNested staticNested=new Outer2.StaticNested();
        staticNested.show();
    }

}
