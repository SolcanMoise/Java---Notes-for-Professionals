package ch19_BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Perform basic mathematical operations with BigDecimals.
 *
 * @author solcanm
 * @version 1.0
 * @since 2019-12-27
 */
public class MathematicalOperations {

    public static void main(String[] args) {

        // create 2 BigDecimal numbers
        BigDecimal a = new BigDecimal("5");
        BigDecimal b = new BigDecimal("7");

        // perform addition
        BigDecimal sum = a.add(b);

        // perform subtraction
        BigDecimal sub = a.subtract(b);

        // perform multiplication
        BigDecimal mul = a.multiply(b);

        // perform division
        BigDecimal div = a.divide(b, 10, RoundingMode.FLOOR);

        // perform remainder(modulus)
        BigDecimal mod = a.remainder(b);

        // perform power
        BigDecimal pow = a.pow(10);

        // perform max(equivalent to MAX(a, b))
        BigDecimal max = a.max(b);

        // perform min(equivalent to MIN(a, b))
        BigDecimal min = a.min(b);

        // move point to left
        BigDecimal a1 = new BigDecimal(12.3456789);
        BigDecimal a1PL = a1.movePointLeft(1);

        // move point to right
        BigDecimal b1 = new BigDecimal(13.579);
        BigDecimal b1PR = b1.movePointRight(2);
    }
}
