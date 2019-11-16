package ch4_Reference_data_types;

/**
 * Dereferencing happen with the .(dot) operator
 * Dereferencing follows the memory address stored in a reference, to the place in memory where the
 * actual object resides. When an object has been found, the requested method is called.
 * When the reference has the value null, deferencing results in a NullPointerException.
 *
 * @author solcanm
 * @version 1.0
 * @since 2019-11-16
 */
public class Dereferencing {

    public static void main(String[] args) {
        // Instantiating a reference type
        Object object = new Object(); // Note the 'new' keyword
        String text = object.toString(); // 'object' is dereferenced

        Object obj = null;
        obj.toString(); // Throws a NullPointerException when this statement is executes
    }
}
