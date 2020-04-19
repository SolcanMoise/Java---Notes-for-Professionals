package ch23_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Remove an element from an array.
 * <p>
 * Java doesn't provide a direct method in {@link Arrays} to remove an element from an array.
 * To perform it, you can either copy the original array to a new one without the element to remove
 * or convert your array to another structure allowing the removal.
 *
 * @author solcanm
 */
public class RemoveElementFromArray {

    public static void main(String[] args) {

        // Using ArrayList
        String[] array = new String[]{"foo", "bar", "baz"};
        List<String> list = new ArrayList<>(Arrays.asList(array));
        list.remove("foo");

        array = list.toArray(new String[0]);
        System.out.println(Arrays.toString(array));

        // Using System.arraycopy()
        int[] intArray = new int[]{1, 2, 3, 4};
        int[] inrResult = new int[intArray.length -1];
        int index = 1;
        System.arraycopy(intArray, 0, inrResult, 0, index);
        System.arraycopy(intArray, index + 1, inrResult, index, intArray.length - index -1);

        System.out.println(Arrays.toString(inrResult));
    }
}
