package ch23_Arrays;

import java.util.Arrays;
import java.util.Iterator;
import java.util.PrimitiveIterator;
import java.util.stream.IntStream;

/**
 * You can iterate over arrays either by using enhanced for loop(aka foreach) or by using array indices.
 *
 * @author solcanm
 * @version 1.0
 * @since 2020-01-02
 */
public class IteratingOverArrays {

    public static void main(String[] args) {

        // declaring an empty array
        int[] array = new int[10];

        // iterate using indices: read and write
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        // extended for: read only
        for (int e : array) {
            System.out.println(e);
        }

        System.out.println();

        /*
         It is worth nothing here that there is no direct way to use an Iterator on an Array, but through the
         Arrays library it can be easily converted to a list to obtain an Iterable object.
         For boxed arrays use Arrays.asList():
         */
        Integer[] boxed = {1, 2, 3};
        Iterable<Integer> iterable = Arrays.asList(boxed);
        Iterator<Integer> iterator = iterable.iterator();
        if (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        iterator.forEachRemaining(System.out::println);

        /*
         For primitive arrays(using Java 8) use streams.
         */
        int[] primitives = {1, 2, 3};
        IntStream primitiveStream = Arrays.stream(primitives); // list-backed iterable
        PrimitiveIterator.OfInt fromPrimitive = primitiveStream.iterator();

        System.out.println();

        /*
         In two-dimensional arrays or more, both techniques can be used in a slightly more complex fashion.
         */
        int[][] twoDimArray = new int[10][10];
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < i; j++) {
                twoDimArray[i][j] = i;
            }
        }

        for (int[] x : twoDimArray) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }

        /*
         One note of caution!
         When using array indices, make sure the index is between 0 and array.length - 1. Don't make
         hard coded assumptions on the array length otherwise you might break your code if the array
         length changes but your hard coded values don't.
         */
        int[] numbers = {3, 5, 7, 9};
        // DO THIS
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] += 1;
        }
        // DON'T DO THIS
        for (int i = 0; i < 3; i++) {
            numbers[i]++;
        }

        System.out.println();

        /*
         Accessing arrays in reverse order
         */
        int[] positiveNumbers = {1, 4, 2, 8, 9, 0};
        for (int x = positiveNumbers.length - 1; x >= 0; x--) {
            System.out.print(positiveNumbers[x] + " ");
        }

        System.out.println();

        /*
         Using temporary arrays to reduce code repetition.
         Iterating over temporary array instead of repeating code can make your code cleaner.
         It can be used where the same operation is performed on multiple values.
         */

        // we want to print out all of these
        String name = "Margaret";
        int eyeCount = 16;
        double height = 50.2;
        int legs = 9;
        int arms = 5;
        // copy-paste approach:
        System.out.println(name);
        System.out.println(eyeCount);
        System.out.println(height);
        System.out.println(legs);
        System.out.println(arms);

        System.out.println();

        // temporary array approach:
        for (Object attribute : new Object[]{name, height, legs, arms}) {
            System.out.println(attribute);
        }
    }
}