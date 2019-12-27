package ch20_BigInteger;

import java.math.BigInteger;

/**
 * You can compare BigInteger same as you compare String or other objects in Java.
 * <p>
 * In general, do not use the == operator to compare BigIntegers.
 * The == operator compares references, i.e. whether two values refer to the same object.
 * Equals() method compares the content of two BigIntegers.
 * <p>
 * You can also compare BigIntegers by using compareTo() method.
 *
 * @author solcanm
 * @version 1.0
 * @since 2019-12-27
 */
public class ComparingBigIntegers {

    public static void main(String[] args) {

        BigInteger one = BigInteger.valueOf(1);
        BigInteger two = BigInteger.valueOf(2);

        if (one.equals(two)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }
    }
}
