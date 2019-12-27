package ch20_BigInteger;

import java.math.BigInteger;
import java.util.Random;

/**
 * The {@link BigInteger} class has a constructor dedicated to generate random BigIntegers, given an instance
 * of {@link java.util.Random} and an int that specifies how many bits will the {@link BigInteger} have.
 * <p>
 * You can implement an algorithm on-the-fly with an anonymous class! Note that rolling out your own
 * RNG algorithm will end up with low quality randomness, so always be sure to use an algorithm that
 * is proven to be decent unless you want the resulting {@link BigInteger} to be predictable.
 *
 * @author solcanm
 * @version 1.0
 * @since 2019-12-27
 */
public class RandomBigInteger {

    public static void main(String[] args) {

        Random instance = new Random();

        for (int i = 0; i < 10; i++) {
            System.out.println(new BigInteger(32, instance));
        }
    }
}
