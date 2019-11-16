package ch10_Primitive_data_types;

/**
 * A char can store a single 16-bin Unicode character. A character literal is
 * enclosed in single quotes.
 *
 * @author solcanm
 * @version 1.0
 * @since 2019-11-16
 */
public class CharPrimitive {

    public static void main(String[] args) {
        char myChar1 = 'u';
        char myChar2 = '5';
        char myChar3 = 65; // myChar3 = 'A'

        char minChar = '\u0000'; // 0
        char maxChar = '\uffff'; // 65,535

        // Escape sequences:
        char singleQupte = '\'';
        char doubleQuote = '\"';
        char tab = '\t';
        char newLine = '\n';
        char carriageReturn = '\r';
        char formFeed = '\f';
        char backSlash = '\\';
        char unicodeChar = '\u2764'; // ❤

        System.out.println(unicodeChar);
    }
}
