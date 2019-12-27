package ch19_BigDecimal;

import java.math.BigDecimal;

/**
 * BigDecimal objects are immutable.
 *
 * @author solcanm
 * @version 1.0
 * @since 2019-12-27
 */
public class BigDecimalsAreImmutable {

    public static void main(String[] args) {

        BigDecimal zero = BigDecimal.ZERO;
        BigDecimal one = BigDecimal.ONE;
        BigDecimal ten = BigDecimal.TEN;

        zero.add(ten);
        System.out.println("Zero = " + zero);

        BigDecimal nine = ten.subtract(one);
        System.out.println("Nine = " + nine);
    }
}
