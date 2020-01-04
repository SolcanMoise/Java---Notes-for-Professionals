package ch23_Arrays;

import java.util.Arrays;

/**
 * The simple answer is that you cannot do this. Once an array has been created, its size cannot be changed.
 * Instead an array can only be resized by creating a new array with the appropriate size and copying the
 * elements from the existing array to the new one.
 * <p>
 * To copy elements from one array to another you can use {@link System#arraycopy(Object, int, Object, int, int)}.
 *
 * @author solcanm
 * @version 1.0
 * @since 2020-01-04
 */
public class ChangeTheSizeOfAnArray {

    public static void main(String[] args) {

        // create an array
        String[] strings = new String[3];
        strings[0] = "New York";
        strings[1] = "London";
        strings[2] = "Berlin";

        System.out.println("Initial array of cities: " + Arrays.toString(strings));

        // add a new city to array
        String[] newStrings = new String[strings.length + 1];
        System.arraycopy(strings, 0, newStrings, 0, strings.length);
        newStrings[strings.length] = "Bucharest";

        System.out.println("Second array of cities: " + Arrays.toString(newStrings));
    }
}
