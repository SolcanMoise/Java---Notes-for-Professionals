package ch10_Primitive_data_types;

/**
 * A primitive data such as int holds values directly into the variable that is using it,
 * meanwhile a variable that was declared using Integer holds a reference to the value.
 * <p>
 * According to Java API, the Integer class wraps a value of the primitive type int in an
 * object. An object of type Integer contains a single field whose type is int.
 * <p>
 * If you need to store a number outside int range, long should be used instead. Exceeding
 * the value range of int leads to an integer overflow, causing the value exceeding the
 * range to be added to the opposite site of the range(positive become negative and vise versa)
 *
 * @author solcanm
 * @version 1.0
 * @since 2019-11-17
 */
public class IntPrimitive {

    public static void main(String[] args) {
        int positiveVal = 3;
        int negativeVal = -5;
        int maxValue = 2147483647; // Integer.MAX_VALUE
        System.out.println(maxValue);
        int overflow = maxValue + 1; // Integer.MIN_VALUE
        System.out.println(overflow);
    }
}
