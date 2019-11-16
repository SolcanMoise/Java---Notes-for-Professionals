package ch9_Literals;

/**
 * Hexadecimal, Octal and Binary literals
 * <p>
 * A hexadecimal number is a value in base-16. There are 16 digits, 0-9 and the letters
 * A-F(case does not matter). A-F represents 10-15.
 * <p>
 * An octal number is a value in base-8, and uses the digits 0-7.
 * <p>
 * A binary numbers is a value in base-2, and it uses the digits 0 and 1.
 *
 * @author solcanm
 * @version 1.0
 * @since 2019-11-16
 */
public class HOBLiterals {

    public static void main(String[] args) {
        // All of these numbers result in the same value, 110:
        int dec = 110; // no prefix         -->> decimal literal
        int bin = 0b1101110; // '0b' prefix -->> binary literal
        int oct = 0156; // '0' prefix       -->> octal literal
        int hex = 0x6E; // ''0x' prefix     -->> hexadecimal literal
    }
}
