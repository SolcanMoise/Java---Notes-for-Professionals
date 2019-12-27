package ch22_BitManipulation;

/**
 * If an integer x is a power of 2, only one bit is set, whereas x-1 has all bits set after that.
 * <p>
 * For example 4 is 100 and 3 is 011 as binary number, which satisfies the aforementioned condition.
 * Zero is not a power of 2 and has to be checked explicitly.
 *
 * @author solcanm
 * @version 1.0
 * @since 2019-12-27
 */
public class PowerOf2 {

    public static void main(String[] args) {

        int number = 8;
        boolean isPowerOfTwo = isPowerOfTwo(number);
        System.out.println(number + " is power of 2: " + isPowerOfTwo);
    }

    private static boolean isPowerOfTwo(final int i) {
        return (i != 0) && (i & (i - 1)) == 0;
    }
}
