package ch23_Arrays;

import java.util.Arrays;

/**
 * Comparing arrays for equality.
 *
 * Tom compare arrays for equality based on their values, use {@link java.util.Arrays#equals(Object[], Object[])} )},
 * which is overloaded for all array types.
 *
 * When the element type is a reference type, {@link Arrays#equals(Object[], Object[])} calls equals on each
 * elements to determine equality. In particular, if the element type is itself an array type, identity
 * comparison will be used.
 * To compare multidimensional arrays for equality, use {@link Arrays#deepEquals(Object[], Object[])} instead.
 *
 * @author solcanm
 */
public class ComparingArraysForEquality {

    public static void main(String[] args) {

        int[] a = new int[]{1, 2, 3};
        int[] b = new int[]{1, 2, 3};
        System.out.println(a.equals(b)); // prints "false" because a and b refer to different objects
        System.out.println(Arrays.equals(a, b)); // prints "true" because the elements of a and b have the same values

        Object[] aObject = {a};
        Object[] bObject = {b};
        System.out.println(Arrays.equals(aObject, bObject)); // false
        System.out.println(Arrays.deepEquals(aObject, bObject)); // true
    }

}
