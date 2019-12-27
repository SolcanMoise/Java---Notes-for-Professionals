package ch20_BigInteger;

import java.math.BigInteger;

/**
 * {@link BigInteger} supports the binary logic operations that are available to {@link Number} types
 * as well. As with all operations they are implemented by calling a method.
 *
 * @author solcanm
 * @version 1.0
 * @since 2019-12-27
 */
public class LogicOperationsOnBigInteger {

    public static void main(String[] args) {

        BigInteger ten = BigInteger.TEN;
        BigInteger nine = BigInteger.valueOf(9);

        // binary OR
        System.out.println("OR: " + ten.or(nine));

        // binary AND
        System.out.println("AND: " + ten.and(nine));

        // binary XOR
        System.out.println("XOR: " + ten.xor(nine));

        // right shift
        System.out.println("Right shift: " + ten.shiftRight(1));

        // left shift
        System.out.println("Left shift: " + ten.shiftLeft(1));

        // binary inversion(NOT)
        System.out.println("NOT: " + ten.not());

        // and-not(NAND)
        System.out.println("NAND: " + ten.andNot(nine));
    }
}
