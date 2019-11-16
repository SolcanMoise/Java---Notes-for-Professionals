package ch7_command_line_arguments;

/**
 * Command line arguments
 * <p>
 * Go to terminal and type: javac Main.java
 * java Main arg1 arg2
 *
 * @author solcanm
 * @version 1.0
 * @since 2019-11-16
 */
public class Main {

    public static void main(String[] args) {
        // Run the application
        System.out.println("it worked: " + args[0] + " " + args[1]);
    }
}
