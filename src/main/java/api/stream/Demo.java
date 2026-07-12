package api.stream;

import java.lang.constant.Constable;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Demo {
    static void main() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);


//        ? Method one using anonymous class

        Consumer<Integer> con=new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };

        list.forEach(con);
        System.out.println("***********************************");


//        ? Method two with lambda expressions

        Consumer<Integer> con1=(Integer integer)->{
            System.out.println(integer);
        };

        list.forEach(con1);
        System.out.println("***********************************");


        //? Method three with method reference

        Consumer<Integer> con2= System.out::println;
        list.forEach(con2);
        System.out.println("***********************************");
    //? Method four with directly in forEach loop
        list.forEach(n->System.out.println(n));
    }
}
