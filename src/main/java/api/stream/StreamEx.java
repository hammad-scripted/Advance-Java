package api.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx {

    static void main() {
        List<Integer> list = Arrays.asList(12, 24, 64, 1, 6, 8, 10);

        Stream<Integer> stream = list.stream();
        Stream<Integer> stream1 = list.stream();
        System.out.println(stream.filter(n -> n % 2 == 0));
        System.out.println(stream1.map(n -> n * 2));


    }
}
