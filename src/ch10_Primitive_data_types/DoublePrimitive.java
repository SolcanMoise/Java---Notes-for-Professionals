package ch10_Primitive_data_types;

/**
 * A double is a double-precision 64-bit IEEE 754 floating point number.
 * <p>
 * While using double is fine for most applications, neither float or double should
 * be used to store precise numbers such as currency. Instead BigDecimal class
 * should be used.
 * <p>
 * Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY and Double.NaN are double values.
 * Nan stands for results of the operations that cannot be determined, such as dividing
 * 2 infinite values. Furthermore 0d and -0d are different, but == yields true.
 *
 * @author solcanm
 * @version 1.0
 * @since 2019-11-17
 */
public class DoublePrimitive {

    public static void main(String[] args) {
        double positiveVal = 12.3;
        double negativeVal = -12.3;

        double scientificNotationDouble = 1.2e-3; // 0.0012

        double negativeZero = -0.0;
        double positiveZero = 0.0;

        System.out.println(negativeVal / positiveVal);
        System.out.println(1d / positiveZero); // Infinity
        System.out.println(1d / negativeZero); // -Infinity
        System.out.println(Double.POSITIVE_INFINITY / Double.POSITIVE_INFINITY); // Nan
    }
}
