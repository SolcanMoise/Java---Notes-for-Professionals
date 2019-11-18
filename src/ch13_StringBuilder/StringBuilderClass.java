package ch13_StringBuilder;

import java.util.Formatter;
import java.util.StringJoiner;

/**
 * Java {@link StringBuilder} class is used to create mutable string.
 * <p>
 * The Java StringBuilder class is same as {@link StringBuffer} class except that is non-synchronized.
 * The StringBuilder class was added in Java 5 to address performance issues with the original
 * StringBuffer class. The API for the two classes are essentially the same.
 * <p>
 * The {@link Formatter} class was added in Java 5, and is loosely modeled on the sprintf function in the
 * C standard library. It takes a format string with embedded format specifiers and a sequences of
 * other arguments, and generates a string by converting the arguments into text and substituting
 * them in place of the format specifiers. The details of the format specifiers say how the
 * arguments are converted into text.
 * <p>
 * The {@link StringJoiner} class was added in Java 8. It is a special purpose formatter that succinctly
 * formats a sequence of strings with a separators between them. It is designed with fluent API,
 * and can be used with Java 8 streams.
 * <p>
 * The use-case for the 4 class can be summarized:
 * ---> {@link StringBuilder} suitable for any string assembly OR string modification task
 * ---> {@link StringBuffer} use(only) when you require a thread-safe version of StringBuilder
 * ---> {@link Formatter} provides much richer string formatting functionality, but is not as efficient
 * as StringBuilder. This is because each call to {@link Formatter#format(String, Object...)} entails:
 * parsing the format string, creating and populate a vararg array, and autoboxing any primitive
 * type argument.
 * ---> {@link StringJoiner} provide succinct and efficient formatting of a sequence of strings with
 * separators, but is not suitable for other formatting tasks.
 *
 * @author solcanm
 * @version 1.0
 * @since 2019-11-18
 */
public class StringBuilderClass {

    public static void main(String[] args) {

        /*
          StringBuilder example.
         */
        int one = 1;
        String color = "red";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("One = ").append(one).append(", Color = ").append(color).append('\n');
        System.out.println(stringBuilder);

        /*
          Formatter example
         */
        Formatter formatter = new Formatter();
        formatter.format("One = %d, colour = %s%n", one, color);
        System.out.println(formatter);

        /*
          StringJoiner example
         */
        StringJoiner joiner = new StringJoiner(", ", "[(", ")]");
        for (String s : new String[]{"a", "b", "c"}) {
            joiner.add(s);
        }
        System.out.println(joiner);

        /*
          Problem: Create a String containing n repetitions of a String a;
         */
        final int n = 10;
        final String a = "abc";
        solveProblemWithString(n, a);
        solveProblemWithStringBuilder(n, a);
    }

    /**
     * Creates a string which contains {@code int n} repetitions of {@code String a} using {@link StringBuilder} class.
     * <p>
     * This allows creating the String in O(s.length() * n).
     *
     * @param n umber of repetitions
     * @param a initial string
     */
    private static void solveProblemWithStringBuilder(final int n, final String a) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            builder.append(a);
        }
        System.out.println(builder);
    }

    /**
     * Creates a string which contains {@code int  n} repetitions of {@code String a} using {@link String} class.
     * <p>
     * This creates a new String instances containing 1 to n repetitions of {@code result} resulting in a
     * runtime of (s.length() * n2) = O(s.length() * (1+2+...+(n-1)+n)).
     *
     * @param n number of repetitions
     * @param a initial string
     */
    private static void solveProblemWithString(final int n, final String a) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result += a;
        }
        System.out.println(result);
    }
}
