package ch12_StringBuffer;

/**
 * Introduction to {@link StringBuffer} class.
 * <p>
 * Key points:
 * - used to create mutable(modifiable) strings
 * - Mutable: Which can be changed
 * - is thread-safe i.e multiple threads cannot access it simultaneously
 *
 * @author solcanm
 * @version 1.0
 * @since 2019-11-18
 */
public class StrinBufferClass {

    public static void main(String[] args) {
        // Example showing difference between String and StringBuffer implementations.
        String str = "study";
        str.concat(" tonight");
        System.out.println(str); //study

        StringBuffer stringBuffer = new StringBuffer("study");
        stringBuffer.append(" tonight");
        System.out.println(stringBuffer); // study tonight
    }
}
