package ch10_Primitive_data_types;

import java.util.Objects;

/**
 * By default, long is 64-bit signed integer.
 * <p>
 * An 'L' must be appended at the end of the number, because by default,
 * numbers are assumed to be int type.
 *
 * @author solcanm
 * @version 1.0
 * @since 2019-11-17
 */
public class LongPrimitive {

    public static void main(String[] args) {
        long highValue = Long.MAX_VALUE;
        long lowValue = Long.MIN_VALUE;
        long defaultValue;

        /*
          Java caches Integers object instances from range -128 to 127.
         */
        Long val1 = 127L;
        Long val2 = 127L;
        System.out.println(val1 == val2); // true

        Long val3 = 128L;
        Long val4 = 128L;
        System.out.println(val3 == val4); // false

        System.out.println(Objects.equals(val3, val4)); // true
    }
}
