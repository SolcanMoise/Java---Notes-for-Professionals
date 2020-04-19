package ch23_Arrays;

import java.util.Arrays;

/**
 * Java provides several ways to copy an array.
 *
 * @author solcanm
 */
public class CopyingArrays {

    public static void main(String[] args) {

        int[] a = new int[]{1, 2, 3, 4, 5};
        int[] b = new int[a.length];
         /*
            Using System.arraycopy()
            Copies an array from the specified source array, beginning at the specified position, to the specified
            position of the destination array.
          */
        System.arraycopy(a, 0, b, 0, a.length);
        System.out.println(Arrays.toString(b));

        /*
            Using Object.clone()
            Since arrays are Objects in Java, you can use Object.clone().
            Note that the Object.clone method for an array performs a shallow copy, i.e. it returns a
            reference to a new array which references tha same elements as the source array.
         */
        int[] c = a.clone();
        System.out.println(Arrays.toString(c));

        /*
            Using Arrays.copyOf()
            java.util.Arrays provides an easy way to perform the copy of a array to another.
            Note than Arrays.copyOf() also provides an overload which allows you to change the type
            of the array.
         */
        int[] d = Arrays.copyOf(a, a.length);
        System.out.println(Arrays.toString(d));

        /*
            Using Arrays.copyOfRange()
            Mainly used to copy a part of an Array, you can also use it to copy whole array to another.
         */
        int[] e = Arrays.copyOfRange(a, 0, a.length);
        System.out.println(Arrays.toString(e));
    }

}
