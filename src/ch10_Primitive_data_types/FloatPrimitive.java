package ch10_Primitive_data_types;

/**
 * A float is a single-precision 32-bit IEEE 754 floating point number. By default, decimals
 * are interpreted as doubles. To create a float, simply append an f to the decimal literal;
 *
 * @author solcanm
 * @version 1.0
 * @since 2019-11-16
 */
public class FloatPrimitive {

    public static void main(String[] args) {
        double doubleVal = 0.5; // without 'f' after digits = double
        float floatVal1 = 0.5f; // this is a float...
        float positiveVal = 234f;
        float negativeVal = -234f;
        float integerVal = 123.0F;
        float underZeroFloat = 0.0423F;

        /*
          Floats handle the five common arithmetical operations: additions, subtraction,
          multiplication, division, modulus.
         */
        float add = 37.2f + -3.5f; // 33.7
        float sub = 99.0f - 1.2f;  // 97.8
        float div = 3.5f / 2.2f;   // 1.590909
        float mul = 3.33f * 3.33f; // 11.0889
        float mod = 37.1f % 2.7f;  // 1.9999979

        /*
          Because of the way floating points numbers are stored, many numbers don't
          have an exact representation.
         */
        float nonExact = 3.1415926f;
        System.out.println(nonExact); // 3.1415925
    }
}
