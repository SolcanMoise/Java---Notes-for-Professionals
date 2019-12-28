package ch23_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

/**
 * An array is a data structure that holds a fixed number of primitive values or references to
 * object instance.
 * <p>
 * Each item in an array is called an element, and each element is accessed by its numerical index.
 * The length of an array is established when the array is created. The size of an array is fixed at
 * runtime when initialized. It cannot be changed after initialization. If the size must be mutable
 * at runtime, a {@link Collection} class such as {@link ArrayList} should be used instead.
 * {@link ArrayList} stores elements in an array and supports resizing by allocating a new array
 * and copying elements from the old array.
 * <p>
 * Arrays may not be re-initialized with array initializer shortcut syntax.
 * <p>
 * Because all arrays are int-indexed, the size of an array must be specified by an int.
 * Arrays use a zero-based index system, which means indexing starts at 0 and ends at length - 1.
 * <p>
 * Accessed to elements of arrays are done in constant time. That means accessing to the first
 * element of the array has the same cost(in time) of accessing the second element, the third
 * element and so on.
 * <p>
 * In Java, it is possible t have arrays of size 0. However, since it's an empty array, no elements
 * can be read from it or assigned to it.
 * <p>
 * {@code array.length} returns the actual size of the array and not the number of array elements
 * which were assigned a value, unlike {@link ArrayList#size()} which returns the number of array
 * elements which were assigned a value.
 * <p>
 * Because arrays are covariant, a reference type array can be initialized as an array of a subclass,
 * although an {@link ArrayStoreException} will be thrown.
 * <p>
 * {@link Arrays#fill(Object[], Object)} can be used to fill an array with the same value after
 * initialization.
 *
 * @author solcanm
 * @version 1.0
 * @since 2019-12-28
 */
public class CreatingAndInitializingArrays {

    public static void main(String[] args) {

        basicCreateAndInitializingArrays();
        createArraysFromCollectionsAndStreams();

    }

    /**
     * Arrays, Collections and Streams
     */
    private static void createArraysFromCollectionsAndStreams() {
        // Auto-boxing happening for int 127 here.
        Integer[] initial = {127, Integer.valueOf("4")};
        List<Integer> toList = Arrays.asList(initial); // Fixed size

        // Works with all collections
        Integer[] fromCollection = toList.toArray(new Integer[toList.size()]);

        // Streams - JDK 8+
        Stream<Integer> toStream = Arrays.stream(initial);
        Integer[] fromStream = toStream.toArray(Integer[]::new);
    }

    /**
     * Basic cases.
     */
    private static void basicCreateAndInitializingArrays() {
        int[] numbers1 = new int[3]; // Array for 3 int values, default value is 0
        int[] numbers2 = {1, 2, 3}; // Array literal of 3 int values
        int[] numbers3 = new int[]{1, 2, 3}; // Array of 3 values initialized
        int[][] numbers4 = {{1, 2}, {3, 4, 5}}; // Jagged array literal
        int[][] numbers5 = new int[5][]; // Jagged array, one dimension 5 long
        int[][] numbers6 = new int[5][4]; // Multidimensional array: 5x4
        float[] boats = new float[5]; // Array of five 32-bit floating point numbers.
        double[] header = new double[]{2.3, 2.4}; // Array of two 64-bit floating point numbers.
        String[] theory = new String[]{"a", "b"}; // Array of two strings(reference type).
        Object[] dArt = new Object[]{new Object(), "We love Stack Overflow", new Integer("3")};
    }
}
