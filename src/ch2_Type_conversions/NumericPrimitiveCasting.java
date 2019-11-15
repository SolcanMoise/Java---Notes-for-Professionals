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
        long eLongVal = (long) eFloatVal;
        int eIntVal = (int) eLongVal;
        short eShortVal = (short) eIntVal;
        byte eByteVal = (byte) eShortVal;

        testNumericPromotion();
    }

    private static void testNumericPromotion() {
        char char1 = 1, char2 = 2;
        short short1 = 1, short2 = 2;
        int int1 = 1, int2 = 2;
        float float1 = 1.0f, float2 = 2.0f;

        // char1 = char1 + char2; // Error: Cannot convert from int to char
        int char12 = char1 + char2; // char is promoted to int

        //short1 = short1 + short2; // Error: Cannot convert from int to short
        int short12 = short1 + short2; // short is promoted to int

        int char1short1 = char1 + short1; // both char and short promoted to int

        int int12 = int1 + int2; // int is unchanged

        float short2float2 = short2 + float2; // short is promoted to float

        float float12 = float1 + float2; // float is unchanged

    }
}
