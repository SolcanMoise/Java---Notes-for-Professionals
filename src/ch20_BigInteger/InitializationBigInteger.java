package ch20_BigInteger;

import java.math.BigInteger;

/**
 * The {@link BigInteger} class is used for mathematical operations involving large integers with magnitudes
 * to large for primitive data types.
 * <p>
 * For example 100-factorial is 158 digits - much larger than a long can represent.
 * {@link BigInteger} provide analogues to all Java's primitive integer operators, and all
 * relevant methods from {@link Math} as well as few other operations.
 *
 * @author solcanm
 * @version 1.0
 * @since 2019-12-27
 */
public class InitializationBigInteger {

    public static void main(String[] args) {

        // convert int values to BigInteger
        int intVal = Integer.MAX_VALUE;
        BigInteger valFromInt = BigInteger.valueOf(intVal);

        // convert long values to BigInteger
        long longVal = Long.MAX_VALUE;
        BigInteger valfromLong = BigInteger.valueOf(longVal);

        // convert a String to BigInteger
        String decimalString = "-100";
        BigInteger valFromString = new BigInteger(decimalString);
    }
}
