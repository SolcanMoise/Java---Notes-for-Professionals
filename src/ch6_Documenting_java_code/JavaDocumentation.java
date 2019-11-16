/**
 * Package documentation goes here; any documentation before the first period will
 * be used as summary.
 * <p>
 * It is common practice to leave a blank line between the summary and the rest of
 * the documentation; use this space to describe the package in as much detail
 * as is appropriate.
 * <p>
 * Inline tags such as {@code code here}, {@link ch6_Documenting_java_code.JavaDocumentation}
 * and {@literal text here} can be used in this documentation.
 */
package ch6_Documenting_java_code;

import java.io.IOException;
import java.io.InputStream;

/**
 * Brief summary of this class, ending with a period.
 * <p>
 * It is common to leave a blank line between the summary and further details.
 * The summary (everything before the first period) is used in the class or package
 * overview section.
 * <p>
 * The following inline tags can be used (not an exhaustive list):
 * {@link ch1_Getting_started.HelloWorld} for linking to other docs or symbols
 * {@link ch1_Getting_started.HelloWorld class} the link's appearance can be
 * customized by adding a display name after the doc or symbol locator
 * {@code public static void main(String[] args) {
 * System.out.println("Hello, World!");
 * }}
 * {@literal <>[]()display} for interpreting literal text without converting to HTML markup
 * or other tags.
 * <p>
 * Optionally, the following tags may be used at the end of class documentation:
 *
 * @author solcanm
 * @version 1.0
 * @see ch1_Getting_started.HelloWorld
 * @since 2019-11-16
 * @deprecated This class has been replaced by BetterJavaDocumentation
 */
public class JavaDocumentation {

    /**
     * Fields can be documented as well.
     * <p>
     * As with other javadoc, the documentation before the first period is used as a
     * summary, and is usually separated from the rest of the documentation by a blank
     * line.
     * <p>
     * Documentation for fields can use inline tags, such as:
     * {@code code here}
     * {@literal text here}
     * {@link JavaDocumentation}
     * <p>
     * Field documentation can also make use of the following tags:
     *
     * @see JavaDocumentation#read(InputStream)
     * @since 2019-11-16
     */
    private static final String CONSTANT_STRING = "FIELD";

    /**
     * Brief summary of method, ending with a period.
     * <p>
     * Further description of method and what it does, including details as is
     * appropriate. Inline tags such as {@code code here}, {@literal text here} can be used.
     * <p>
     * If a method overrides a superclass method, {@inheritDoc docs} can be used to copy
     * the documentation from the superclass method.
     *
     * @param stream Describe the parameter. include as much details as is appropriate
     *               Parameter docs are commonly alignment as here, but this is optional.
     *               As with other docs, the documentation before the first period is used as
     *               a summary.
     * @return Describe the return values. Include as much details as is appropriate
     * Return type docs are commonly aligned as here, but this is optional.
     * As with other docs, the documentation before the first period is used as a
     * summary.
     * @throws IOException Describe when and why this exception can be thrown.
     *                     Exception docs are commonly aligned as here, but this is optional.
     *                     As with other docs, the documentation before the first period is used
     *                     as a summary.
     *                     Instead of @throws, @exception can also be used.
     * @see InputStream#read(byte[])
     * @since 2019-11-16
     * @deprecated Describe why this method is outdated. A replacement can also be specified.
     */
    public String[] read(InputStream stream) throws IOException {
        return null;
    }
}
