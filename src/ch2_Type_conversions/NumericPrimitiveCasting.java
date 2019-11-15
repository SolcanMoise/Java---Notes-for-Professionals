package ch2_Type_conversions;

/**
 * Numeric primitives can be cast in two ways. Implicit casting happens when the source type has smaller range
 * than the target type. Explicit casting has to be done when the source has larger range that the target type.
 *
 * @author solcanm
 * @version 1.0
 * @since 2019-11-15
 */
public class NumericPrimitiveCasting {

    public static void main(String[] args) {
        // Implicit casting
        byte iByteVal = 42;
        short iShortVal = iByteVal;
        int iIntVal = iShortVal;
        long iLongVal = iIntVal;
        float iFloatVal = iLongVal;
        double iDoubleVal = iFloatVal;

        // Explicit casting
        double eDoubleVal = 42.0d;
        float eFloatVal = (float) eDoubleVal;
        long eLongVal= (long) eFloatVal;
        int eIntVal = (int) eLongVal;
        short eShortVal = (short) eIntVal;
        byte eByteVal = (byte) eShortVal;
    }
}
