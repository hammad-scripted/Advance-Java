package org.example;

//? enum is also a class
enum Status {
    RUNNING,
    FAILED,
    PENDING, SUCCESS
}

//? by default in java enum extends enum class
enum Laptop {
    //? we are getting object in the same class
    Macbook(2000), Thinkpad(1500), HP(1200), XPS(1400);
    private int price;

    //?private constructor
    private Laptop(int price) {
        this.price = price;
    }

    //* getters and setters


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class Demo4 {
    static void main() {
        Status s = Status.FAILED;
        Status[] a = Status.values();
        for (Status k : a) {
            System.out.println(k);
        }
        System.out.println(s);
        System.out.println(s.ordinal());
        System.out.println(s.getClass().getSuperclass());

//* laptop

        Laptop lappy=Laptop.Macbook;
        System.out.println(lappy.getPrice());

        Laptop[] laptop=Laptop.values();
        for (Laptop k : laptop) {
            System.out.println(k);
            System.out.println(k.getPrice());
        }
    }
}
