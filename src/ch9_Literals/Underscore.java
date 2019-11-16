package ch9_Literals;

/**
 * A Java literal is a syntactic element that represents a value.
 * <p>
 * Since Java 7 it has been possible to use one or more underscores(_) for
 * separating of groups of digits in a primitive number literal to improve
 * their readability.
 *
 * @author solcanm
 * @version 1.0
 * @since 2019-11-16
 */
public class Underscore {

    public static void main(String[] args) {
        // for instance, this two declarations are equivalent
        int i1 = 123456;
        int i2 = 123_456;

        // this can be applied to all primitive number literals aas shown below
        byte color = 1_2_3;
        short year = 2_019;
        int socialSecurityNumber = 9_99_999_99_9;
        long creditCardNumber = 1234_5678_9012_3456L;
        float piFourDecimals = 3.14_15F;
        double piTenDecimals = 3.14_15_92_65_35D;
    }
}
