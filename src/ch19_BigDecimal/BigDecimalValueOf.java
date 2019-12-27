package ch19_BigDecimal;

import java.math.BigDecimal;

/**
 * The BigDecimal lass contains an internal cache of frequently used numbers e.g. 0 to 10.
 * <p>
 * The BigDecimal.valueOf() methods are provided in preference with constructors with similar
 * type parameters i.e. in the below example a is preferred to b.
 *
 * @author solcanm
 * @version 1.0
 * @since 2019-12-27
 */
public class BigDecimalValueOf {

    public static void main(String[] args) {

        BigDecimal a = BigDecimal.valueOf(10L); // Returns cached object reference.
        BigDecimal b = new BigDecimal(10L); // Does not return cached object reference.

        BigDecimal a1 = BigDecimal.valueOf(20L); // Does not return cached object reference.
        BigDecimal b1 = new BigDecimal(20L); // Does not return cached object reference.

        BigDecimal a2 = BigDecimal.valueOf(15.15); // Preferred way to convert a double(or float) into a BigDecimal,
        // as the value returned is equal to that resulting from constructing
        // a BigDecimal from the result of using Double.toString(double).
        BigDecimal b2 = new BigDecimal(15.15); // Return unpredictable result.
    }
}
