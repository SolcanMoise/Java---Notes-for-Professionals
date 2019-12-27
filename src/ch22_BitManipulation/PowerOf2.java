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

        expressingPowerOfTwo();
    }

    private static boolean isPowerOfTwo(final int i) {
        return (i != 0) && (i & (i - 1)) == 0;
    }

    /**
     * For expressing the power of 2(2^n) of integers, one may use a bitshift operation that allows
     * to explicitly specify the n.
     * the syntax is basically: int pow2 = 1 << n;
     */
    private static void expressingPowerOfTwo() {

        int twoExp4 = 1 << 4; // 2^4
        int twoExp5 = 1 << 5; // 2^5
        int twoExp6 = 1 << 6; // 2^6
        int twoExp31 = 1 << 31; // 2^31
        System.out.println("2^5 = " + twoExp5);
    }
}
