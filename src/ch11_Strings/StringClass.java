package ch11_Strings;

import java.util.Locale;
import java.util.Objects;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Strings(java.lang.String) are piece of text stored in your program. Strings are not a
 * primitive data type in Java, however, they are very common in Java programs.
 * <p>
 * In Java Strings are immutable, meaning that they cannot be changed.
 *
 * @author solcanm
 * @version 1.0
 * @since 2019-11-17
 */
public class StringClass {

    public static void main(String[] args) {

        // declare two Strings
        String name = "Name";
        String address = "Address";

        /*
          In order to compare Strings for equality, you should use the String objects's
          equal or equalsIgnoreCase methods. Note that equalsIgnoreCase does not let you
          specify a Locale. For instance, if you compare the two words "Taki" and "TAKI"
          in English they are equal; however, in Turkish they are different. For cases
          like this, converting both strings to lowercase(or uppercase) with Locale and
          then comparing with equals is the solution.
         */
        String firstString = "Taki";
        String secondString = "TAKI";
        System.out.println(firstString.equalsIgnoreCase(secondString)); // true
        Locale locale = Locale.forLanguageTag("tr-TR");
        System.out.println(firstString.toLowerCase(locale).equals(secondString.toLowerCase(locale))); // false

        /*
          Do not use the == operator to compare Strings.
          These operator actually test references, and since multiple String objects can represent the same
          String, this is liable to give the wrong answer.
         */
        System.out.println(firstString.toLowerCase() == secondString.toLowerCase()); // false

        /*
          Comparing Strings with constant values.
          When comparing a String to a constant value, you can put the constant value on the left side of
          equals to ensure that you won't get a NullPointerException if the other String is null.
          A more readable alternative is to use Objects.equals(), which does a null check on both parameters.
         */
        final String constant = "CONSTANT_STRING";
        String other = null;
        System.out.println(constant.equals(other)); // false
        // System.out.println(other.equals(constant)); // Error: NullPointerException
        System.out.println(Objects.equals(other, constant)); // false

        /*
          The String type provides two methods for converting strings between upper case and lower case.
          These methods both return the converted strings as new String instances.
          These methods are locale-sensitive, and may produce unexpected results if used on string that
          are intended to be interpreted independent of the locale.
         */
        String admin = "Admin";
        String upper = admin.toUpperCase();
        System.out.println(upper == admin); // false
        String lower = admin.toLowerCase();
        System.out.println(lower == admin); // false

        /*
          String pool and the heap storage.
          Like many Java objects, all String instances are created on the heap, even literals. When the
          JVM finds a String literal that has no equivalent in the heap, the JVM creates a corresponding
          String instance on the heap and also stores a reference to the newly created String instance
          in the String pool. Any other references to the same String literal are replaced with the
          previously created String instance in the heap.
          However using new operator, we force String class to create a new String object in the heap space.
         */
        String a = "alpha";
        String b = "alpha";
        String c = new String("alpha");
        // all  three strings are equivalent
        System.out.println(a.equals(b) && b.equals(c)); // true
        // although only a and b reference the same heap object
        System.out.println(a == b); // true
        System.out.println(a == c); // false
        System.out.println(b == c); // false

        /*
          Joining Strings with a delimiter
          An array of strings can be joined using the static method String.join()
         */
        String[] elements = {"a1", "s2", "a3"};
        String singleString = String.join(" + ", elements);
        System.out.println(singleString);

        /*
          To have a fine-gained control over joining, you may us StringJoiner class.
         */
        StringJoiner stringJoiner = new StringJoiner(", ", "[", "]");
        stringJoiner.add("b1");
        stringJoiner.add("b2");
        stringJoiner.add("b3");
        System.out.println(stringJoiner);

        /*
          To join a stream of strings, you may use joining collector.
         */
        Stream<String> stringStream = Stream.of("c1", "c2", "c3");
        String streamJoined = stringStream.collect(Collectors.joining(", ", "{", "}"));
        System.out.println(streamJoined);
    }
}
