package ch23_Arrays;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Converting an array of objects to {@link Stream}
 *
 * @author solcanm
 * @version 1.0
 * @since 2020-01-02
 */
public class ArraysToStream {

    public static void main(String[] args) {

        String[] strings = {"a", "b", "c"};
        Stream<String> stream = Arrays.stream(strings);
        stream.forEach(System.out::println);

        System.out.println();

        Stream<String> rangeStream = Arrays.stream(strings, 1, 2);
        rangeStream.forEach(System.out::println);

        System.out.println();

        /*
         A method similar to Arrays.stream() is Stream.of(). The difference is that Stream.of() uses a
         vararg parameter.
         */
        Stream<Integer> integerStream = Stream.of(1, 2, 3);
        integerStream.forEach(System.out::println);
    }
}
