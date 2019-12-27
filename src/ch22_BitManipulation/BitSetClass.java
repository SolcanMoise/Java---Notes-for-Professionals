package ch22_BitManipulation;

import java.util.BitSet;
import java.util.stream.IntStream;

/**
 * Since 1.7 there's a {@link BitSet} class that provide simple and user-friendly bit storage and
 * manipulation interface.
 *
 * @author solcanm
 * @version 1.0
 * @since 2019-12-27
 */
public class BitSetClass {

    public static void main(String[] args) {

        BitSet bitSet = new BitSet(8); // by default all bits are unset
        IntStream.range(0, 8).filter(i -> i % 2 == 0).forEach(bitSet::set); // {0, 2, 4, 6}
        bitSet.set(3); // {0, 2, 3, 4, 6}
        bitSet.set(3, false); // {0, 2, 4, 6}

        final boolean bitVal = bitSet.get(3); // false

        bitSet.flip(6); // set bit 6 to false

        bitSet.set(20); // {0, 2, 4, 20} - expands automatically
        System.out.println(bitSet);
    }
}
