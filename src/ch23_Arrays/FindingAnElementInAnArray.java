package ch23_Arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Finding an element in an array.
 *
 * @author solcanm
 * @version 1.0
 * @since 2020-01-03
 */
public class FindingAnElementInAnArray {

    public static void main(String[] args) {

        // declaring two arrays
        String[] strings = {"A", "B", "C"};
        int[] ints = {1, 2, 3, 4};

        // find an element using Arrays.binarySearch() - for sorted arrays only
        int indexOfA = Arrays.binarySearch(strings, "A");
        int indexOf2 = Arrays.binarySearch(ints, 2);

        // find an element using Arrays.asList() - for non-primitive arrays only
        int indexOfC = Arrays.asList(strings).indexOf("C");
        int indexOf1 = Arrays.asList(ints).indexOf(1); // compilation error

        // find an element using Stream
        int indexOf3 = IntStream.range(0, ints.length)
                .filter(i -> i == 1)
                .findFirst()
                .orElse(-1); // if is not present, give us -1


        // test if an array contains an element using Arrays.asList()
        boolean isBPresent = Arrays.asList(strings).contains("B");

        // test if an array contains an element using Stream
        boolean isDPresent = Arrays.stream(strings).anyMatch("D"::equals);
    }
}
