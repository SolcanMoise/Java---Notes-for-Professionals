package ch17_Dates_and_Time;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Before Java 8, there was {@link DateFormat} and {@link SimpleDateFormat} classes in the package java.text and this
 * legacy code will be continued to be used for sometime.
 * <p>
 * But, Java 8 offers a modern approach to handling Formatting and Parsing.
 * <p>
 * In formatting and parsing first you parse a String object to DateTimeFormatter, and in turn use it for
 * formatting or parsing.
 *
 * @author solcanm
 * @version 1.0
 * @since 2019-12-26
 */
public class DateTimeFormat {

    public static void main(String[] args) {

        parsingDate();
        formattingDate();
    }

    private static void formattingDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE d, MMMM, yyyy HH:mm");
        DateTimeFormatter formatter1 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;

        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println("ISO LOCAL DATE TIME Formatter :: " + localDateTime.format(formatter1));
        System.out.println("Custom local date time formatter :: " + localDateTime.format(formatter));
    }

    private static void parsingDate() {
        String pattern = "d-MM-yyyy HH:mm";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);

        LocalDateTime dateTime = LocalDateTime.parse("2019-12-26T20:50"), // default format
                dateTimeFormat = LocalDateTime.parse("26-12-2019 20:50", formatter); // custom format

        System.out.println("Default format :: " + dateTime);
        System.out.println("Custom format :: " + dateTimeFormat);
    }
}
