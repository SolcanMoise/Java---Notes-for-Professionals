package ch15_String_split;

import java.util.Arrays;

/**
 * @author solcanm
 * @version 1.0
 * @since 2019-12-01
 */
public class SplittingStrings {

    public static void main(String[] args) {

        /**
         * Break a string up into substrings all of a known length
         */
        String value = "This is a String";
        String[] parts = value.split("(?<=\\G.{8})");
        Arrays.stream(parts).forEach(System.out::println);

        System.out.println();

        /**
         * Break a string up into substrings all of variable
         * length.
         */
        int splitVal = 3;
        String[] splitResult = value.split("(?<=\\G.{" + splitVal + "})");
        Arrays.stream(splitResult).forEach(System.out::println);
    }
}
