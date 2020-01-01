package ch23_Arrays;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

/**
 * Two methods in {@link Collection} create an array from a collection:
 * - Object[] toArray()
 * - <T> T[] toArray(T[] a)
 * <p>
 * The difference between them is more than just having untyped vs typed results. Their performance can
 * differ as well. Starting from Java SE 8+, where the concept of {@link Stream} was introduced, it is possible
 * to  use the {@link Stream} produced by the collection in order to create a new {@link java.lang.reflect.Array}
 * using the {@link Stream#toArray()} method.
 *
 * @author solcanm
 * @version 1.0
 * @since 2020-01-01
 */
public class ArrayFromCollection {

    public static void main(String[] args) {
        // Object[] toArray can be used as follow:
        Set<String> strings = new HashSet<>();
        strings.add("red");
        strings.add("blue");

        // although set is a Set<String>, toArray() returns an Object[] not a String[].
        Object[] objectArray = strings.toArray();

        // The array does not need to be created up front with the correct size.
        // Only the array type matters.
        String[] arrayString = strings.toArray(new String[0]);

        // If you supply an array of the same size as collection or bigger, it
        // will be populated with collection values and returned.(new array won't be allocated)
        String[] arrayString2 = strings.toArray(new String[strings.size()]);
    }
}
