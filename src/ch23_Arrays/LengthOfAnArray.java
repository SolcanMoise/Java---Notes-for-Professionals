package ch23_Arrays;

import java.util.Arrays;
import java.util.Objects;

/**
 * Getting the length of an array
 * <p>
 * Arrays are objects which provide space to store up to its size of elements of specified type.
 * An array's size can not be modified after the array is created.
 * <p>
 * The length field in an array stores the size of an array. It is a final field and cannot be modified.
 *
 * @author solcanm
 * @version 1.0
 * @since 2020-01-03
 */
public class LengthOfAnArray {

    /**
     * This example shows the difference between the length of an array and amount of objects an array stores.
     */
    public static void main(String[] args) {

        Integer[] arr = new Integer[]{1, 2, 3, null, 5, null, 7, null, null, null, 11, null, 13};

        int arrayLength = arr.length;
        long nonEmptyElementsCount = Arrays.stream(arr).filter(Objects::nonNull).count();

        System.out.println("Array 'arr' has a length of " + arrayLength +
                " and it contains " + nonEmptyElementsCount + " non-empty values");
    }
}
