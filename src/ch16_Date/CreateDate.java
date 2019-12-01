package ch16_Date;

import java.util.Calendar;
import java.util.Date;

/**
 * {@link Date} objects are best created through {@link Calendar} instance since the use of the data constructors
 * are deprecated and discouraged. To do so we need to get instance of the Calendar class from the factory method.
 * Then we can set year, month and day of month by using numbers and in case of months constants provided by the
 * Calendar class to improve readability and reduce errors.
 *
 * @author solcanm
 * @version 1.0
 * @since 2019-12-01
 */
public class CreateDate {

    public static void main(String[] args) {

        // object contains the current date and time when this object was created.
        Date now = new Date();

        Calendar calendar = Calendar.getInstance();
        calendar.set(2019, Calendar.DECEMBER, 1);
        Date today = calendar.getTime();
        System.out.println("Today is: " + today);

    }
}
