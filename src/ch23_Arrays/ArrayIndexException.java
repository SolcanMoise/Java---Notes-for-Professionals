package ch23_Arrays;

/**
 * The {@link ArrayIndexOutOfBoundsException} is thrown when a non-existing index of an array is being accessed.
 * <p>
 * Arrays are zero-based indexed, so the index of the first element is 0 and the index of the last element
 * in the array capacity - 1. Therefore, any request for an array element by the index i has to satisfy the
 * condition 0 <= i < array.length, otherwise the {@link ArrayIndexOutOfBoundsException} is thrown.
 *
 * @author solcanm
 * @version 1.0
 * @since 2020-01-01
 */
public class ArrayIndexException {

    public static void main(String[] args) {

        int index = 2;
        int[] numbers = {0, 1};
        // Notice: no item on index 2.  Trying to access it will raise exception:
        System.out.println("Numbers[2] = " + numbers[2]);
    }
}
