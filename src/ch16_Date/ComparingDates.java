package ch16_Date;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.Calendar;
import java.util.Date;

/**
 * Date comparison before/since Java 8
 * <p>
 * Before Java 8, dates could be compared using {@link Calendar} and {@link Date} classes.
 * <i>Date</i> class offers 4 methods to compare dates:
 * {@link Date#before(Date)},
 * {@link Date#after(Date)},
 * {@link Date#compareTo(Date)} and
 * {@link Date#equals(Object)}.
 * These methods compare the value returned by {@link Date#getTime()} method for each date.
 * <p>
 * With Java 8 a new Object to work with Date is available {@link LocalDate}. This class implements
 * {@link ChronoLocalDate}, the abstract representation of a date where the Chronology, or calendar
 * system is pluggable.
 * <p>
 * <i>LocalDate</i> has 5 methods for compare dates:
 * {@link LocalDate#isBefore(ChronoLocalDate)},
 * {@link LocalDate#isAfter(ChronoLocalDate)},
 * {@link LocalDate#isEqual(ChronoLocalDate)},
 * {@link LocalDate#equals(Object)} and
 * {@link LocalDate#compareTo(ChronoLocalDate)}.
 *
 * @author solcanm
 * @version 1.0
 * @since 2019-12-01
 */
public class ComparingDates {

    public static void main(String[] args) {

        /**
         * Before Java 8
         */
        //Use of Calendar and Date objects
        final Date today = new Date();
        final Calendar calendar1 = Calendar.getInstance();
        calendar1.set(1997, Calendar.AUGUST, 3, 20, 30, 10);
        Date birthday = calendar1.getTime();

        final Calendar calendar2 = Calendar.getInstance();
        calendar2.set(1997, Calendar.AUGUST, 3, 20, 30, 10);
        Date sameBirthday = calendar2.getTime();

        // Before example
        System.out.println("Birthday was before today: " + birthday.before(today));
        // After example
        System.out.println("Today is after birthday: " + today.after(birthday));
        // Compare example
        System.out.println("Today was before birthday: " + (today.compareTo(birthday) < 0));
        // Equals example
        System.out.println("Birthday is equal with sameBirthday: " + birthday.equals(sameBirthday));

        // Clear milliseconds from calendar
        calendar1.clear(Calendar.MILLISECOND);
        calendar2.clear(Calendar.MILLISECOND);
        birthday = calendar1.getTime();
        sameBirthday = calendar2.getTime();
        // Check again the equality!
        System.out.println("Birthday is equal with sameBirthday: " + birthday.equals(sameBirthday));

        /**
         * Since Java 8
         * In case of {@link LocalDate} parameter, isAfter, isBefore, isEqual, compareTo and equals now use
         * method {@link LocalDate#compareTo0(LocalDate)}
         */

    }
}
