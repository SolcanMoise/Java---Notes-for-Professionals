package ch19_BigDecimal;

import java.math.BigDecimal;

/**
 * The {@link BigDecimal} class provides operations for arithmetic(add, subtract, multiply, divide), scale
 * multiplication, rounding, comparison, hashing, and format conversion. The BigDecimal represents immutable,
 * arbitrary-precision signed decimal numbers. This class shall be used in a necessity of high-precision
 * calculation.
 * <p>
 * The method compareTo should be used to compare BigDecimals. Commonly you should not use the equals method
 * since it considers two BigDecimals equal only if they are equal in value and also scale.
 *
 * @author solcanm
 * @version 1.0
 * @since 2019-12-27
 */
public class ComparingBigDecimals {

    public static void main(String[] args) {

        compareBigDecimalUsingCompareTo();
        compareBigDecimalUsingEquals();
    }

    private static void compareBigDecimalUsingEquals() {
        BigDecimal b = new BigDecimal(3);
        final boolean isEqual = b.equals(new BigDecimal(3.00));
        System.out.println(b + " is equal to 3.00 using equals() method: " + isEqual);
    }

    private static void compareBigDecimalUsingCompareTo() {
        BigDecimal a = new BigDecimal(5);
        final int isGreater = a.compareTo(new BigDecimal("2.345"));
        final int isEqual = a.compareTo(new BigDecimal(5.0));
        final int isSmall = a.compareTo(new BigDecimal(7.123));
        System.out.println(a + " is equal to 5.0 using compareTo() method: " + (isEqual == 0));
    }
}
