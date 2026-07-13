package api.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx {

    static void main() {
        List<Integer> list = Arrays.asList(12, 24, 64, 1, 6, 8, 10);

        Stream<Integer> stream = list.stream();
        Stream<Integer> stream1 = list.stream();
        System.out.println(stream.filter(n -> n % 2 == 0));
        System.out.println(stream1.map(n -> n * 2));


//? before streams
        List<String> names = Arrays.asList("Alice", "Bob", "Alex", "Charlie");
        List<String> result = names.stream().filter(name -> name.startsWith("A")).map(String::toUpperCase).collect(Collectors.toList());


        List<Integer> nums = new ArrayList<>();
        nums.add(23);
        nums.add(12);
        nums.add(9);
        nums.add(43);
        nums.add(8);
        nums.add(1);
        nums.add(0);
        nums.add(98);

        Stream<Integer> s1 = nums.stream();
//        Predicate<Integer> p = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return integer % 2 == 0;
//            }
//        };

        Predicate<Integer> p = (integer) -> {
            return integer % 2 == 0;
        };

        List<Integer> result1 = s1.filter(p).collect(Collectors.toList());
        System.out.println(result1);


    }
}
