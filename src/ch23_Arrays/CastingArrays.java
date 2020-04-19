package ch23_Arrays;

import java.util.Arrays;

/**
 * Casting arrays
 * <p>
 * Java SE  provides the method {@link java.util.Arrays#copyOf(Object[], int, Class)} for this purpose.
 *
 * @author solcanm
 */
public class CastingArrays {

    public static void main(String[] args) {

        Double[] doubles = {2.0, 3.2, 5.7};
        Number[] numbers = Arrays.copyOf(doubles, doubles.length, Number[].class);
        System.out.println(Arrays.toString(numbers));
    }
}
