package ch8_Java_command_options;

/**
 * A Java entry-point has a main method with the following signature and modifiers:
 * {@code public static void main(String[] args)}
 * <p>
 * A valid entry-point class method must do the following:
 * <li>
 * <ul>be named <i>main</i>(case-sensitive)</ul>
 * <ul>be <i>public</i> and <i>static</i></ul>
 * <ul>have a <i>void</i> return type</ul>
 * <ul>have a single argument with an array <i>String[]</i></ul>
 * <ul>be generic: type parameters are not allowed</ul>
 * <ul>have a non-generic, top-level enclosing class</ul>
 * </li>
 *
 * @author solcanm
 * @version 1.0
 * @since 2019-11-16
 */
public class Entry_point_class {

    public static void main(String[] args) {
        System.out.println("Code is running");
    }
}
