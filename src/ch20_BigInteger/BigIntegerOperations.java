package ch20_BigInteger;

import java.math.BigInteger;

/**
 * {@link BigInteger} is an immutable object, so you need to assign the result of any mathematical
 * operation, to a new BigInteger instance.
 *
 * @author solcanm
 * @version 1.0
 * @since 2019-12-27
 */
public class BigIntegerOperations {

    public static void main(String[] args) {

        // create two BigInteger instance
        BigInteger one = BigInteger.ONE;
        BigInteger ten = BigInteger.TEN;

        // perform addition
        BigInteger sum = one.add(ten);

        // perform subtraction
        BigInteger sub = ten.subtract(one);

        // perform division
        BigInteger div = ten.divide(one);

        // perform multiplication
        BigInteger mul = ten.multiply(one);

        // perform power
        BigInteger pow = ten.pow(2);

        // perform remainder
        BigInteger rem = one.remainder(ten);

        // perform GCD(greatest common divisors)
        BigInteger gcd = ten.gcd(one);

        // perform maximum
        BigInteger max = ten.max(one);

        // perform minimum
        BigInteger min = one.min(ten);
    }
}
