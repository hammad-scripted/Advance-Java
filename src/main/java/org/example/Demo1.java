package org.example;

interface Greeting {
    void greet();
}

abstract class Greeting2 {
    abstract void displayName(String name);
    private void hh(){
        System.out.println("Hello World");
    }
}

public class Demo1 {
    static void main() {
//        ? anomoyous inner class

        Greeting g = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello World");
            }
        };
        g.greet();

        Greeting2 g2 = new Greeting2() {
            @Override
            public void displayName(String name) {
                System.out.println("Hello " + name);
            }

        };
        g2.displayName("Hammad");
    }
}
/* Step 1 (hidden): Java generates a class behind the scenes, something like:
class Outer$1 implements Greeting {   // compiler-generated name, no name you can use
    @Override
    public void greet() {
        System.out.println("Hello!");
    }
}

// Step 2: Java creates an object of THAT class
Greeting g = new Outer$1();
*
 */