package ch23_Arrays;

import java.util.Arrays;

/**
 * Converting arrays between primitives and boxed types.
 */
public class ConvertingArrays {

    public static void main(String[] args) {
        // Java version >=8
        int[] primitiveArray = {1, 2, 3, 4};
        Integer[] boxedValue = Arrays.stream(primitiveArray).boxed().toArray(Integer[]::new);
    }
}
