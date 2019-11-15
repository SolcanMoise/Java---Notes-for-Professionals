package ch2_Type_conversions;

/**
 * The boolean type cannot be cast to/from any other primitive type.
 * A char can be cast to/fom any numeric type by using the code-point mapping specified by Unicode.
 *
 * @author solcanm
 * @version 1.0
 * @since 2019-11-15
 */
public class NonNumericPrimitiveCasting {

    public static void main(String[] args) {
        // int badInt = (int) true; // Compiler error: incompatible types

        char char1 = 65; // A
        byte byte1 = 'A'; // 65
        short short1 = 'A'; // 65
        int int1 = 'A'; // 65

        char char2 = 8253; // ‽
        byte byte2 = (byte) '‽'; // 61(truncated code-point into the ASCII range)
        short short2 = '‽'; // 8253
        int int2 = '‽'; // 8253
    }
}
