package ch14_String_tokenizer;

import java.util.StringTokenizer;

/**
 * The {@link java.util.StringTokenizer} class allows you to break a String into tokens.
 * <p>
 * The set of delimiters may be specified either at creation or on a per-token basic.
 *
 * @author solcanm
 * @version 1.0
 * @since 2019-11-18
 */
public class StringTokenizerClass {

    public static void main(String[] args) {
        /*
          Basic example of using StringTokenizer
         */
        StringTokenizer tokenizer = new StringTokenizer("Apple ball cat dog", " ");
        while (tokenizer.hasMoreElements()) {
            System.out.println(tokenizer.nextToken());
        }
    }
}
