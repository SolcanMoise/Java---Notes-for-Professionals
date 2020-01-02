package ch23_Arrays;

import java.util.Arrays;

/**
 * Since Java 1.5 you can get a {@link String} representation of the contents of the specified array without
 * iterating over its every element. Just use {@link Arrays#toString(Object[]) or {@link Arrays#deepToString(Object[])}
 * for multidimensional arrays.
 * <p>
 * {@link Arrays#toString(int[])} method uses {@link Object#toString()} method to produce {@link String} values
 * of every items in the array, besde primitive type array, it can be used on every type of arrays.
 *
 * @author solcanm
 * @version 1.0
 * @since 2020-01-02
 */
public class ArraysToAString {

    public static void main(String[] args) {

        int[] oneDimArray = {1, 2, 3, 4};
        System.out.println(Arrays.toString(oneDimArray));

        int[][] twoDimArray = {{1}, {2, 3}, {4, 5, 6}};
        System.out.println(Arrays.toString(twoDimArray)); // something like [[I@5ccd43c2, [I@4aa8f0b4, [I@7960847b]
        System.out.println(Arrays.deepToString(twoDimArray)); // [[1], [2, 3], [4, 5, 6]]

        System.out.println();

        Cat[] arr = {new Cat(), new Cat()};
        System.out.println(Arrays.toString(arr));
    }
}

class Cat { // implicitly extends Object!
    @Override
    public String toString() {
        return "CAT!";
    }
}
