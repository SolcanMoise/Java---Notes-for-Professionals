package ch23_Arrays;

import java.util.*;
import java.util.stream.Collectors;

/**
 * The {@link Arrays#asList(Object[])} method can be used to return a fixed-size {@link List}
 * containing the elements of the given array.
 * <p>
 * The resulting {@link List} will be of the same parameter type as the base of the array.
 * This list is backed by(a view of) the original array, meaning that any changes to the list
 * will change the array and vice versa. However, changes to the list that would change the
 * size(and hence the array length) will throw an exception.
 * <p>
 * To create a copy of the list, use the constructor of teh {@link ArrayList} taking a {@link Collection}
 * as an argument.
 * <p>
 * In Java SE 7 and later, a pair of angle brackets <>(empty set of type arguments) can be used, which is
 * called the Diamond. The compiler can determine the type argument from the context. This means the
 * type information can be left out when calling the constructor of {@link ArrayList} an it will be
 * inferred automatically during compilation. This is called Type Inference which is part of Java
 * Generics.
 * <p>
 * {@link Arrays#asList(Object[])} returns {@link List}, which is an instance of static inner class os
 * {@link Arrays} and not {@link ArrayList}. The resulting list is of fixed-size. That means, adding or
 * removing elements is not supported and will throw an {@link UnsupportedOperationException}.
 *
 * @author solcanm
 * @version 1.0
 * @since 2019-12-28
 */
public class ListFromArray {

    public static void main(String[] args) {
        createListFromArray();
        createListFromArrayUsingArrayListConstructor();

        addAllMethod();
    }

    private static void addAllMethod() {
        // Using ArrayList.addAll()
        String[] strings = {"foo", "bar", "baz"};
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(strings));

        // Using Collections.addAll()
        ArrayList<String> stringArrayList = new ArrayList<>();
        Collections.addAll(stringArrayList, strings);

        // Using Streams
        List list = Arrays.stream(strings).collect(Collectors.toList());
    }

    private static void createListFromArrayUsingArrayListConstructor() {
        String[] strings = {"foo", "bar", "baz"};
        List<String> stringsCopy = new ArrayList<>(Arrays.asList(strings));
    }

    private static void createListFromArray() {
        String[] strings = {"foo", "bar", "baz"};
        List<String> stringList = Arrays.asList(strings);
        try {
            stringList.add("asd");
        } catch (Exception e) {
            System.out.println("This exception is thrown because you try to change the list(implicitly array).");
        }
    }
}
