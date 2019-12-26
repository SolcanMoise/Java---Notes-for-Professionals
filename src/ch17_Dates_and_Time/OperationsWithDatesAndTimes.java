package ch17_Dates_and_Time;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Operations with dates and time.
 *
 * @author solcanm
 * @version 1.0
 * @since 2019-12-26
 */
public class OperationsWithDatesAndTimes {

    public static void main(String[] args) {

        LocalDate tomorrow = getFutureDate(1);
        LocalDate dayAfterTomorrow = getFutureDate(2);

        final LocalDate now = LocalDate.now();
        Long daysBetween = getDaysBetween(tomorrow, now);
    }

    /**
     * Calculate the number of days between two dates.
     *
     * @param date1 the first date
     * @param date2 the second date
     * @return the days between date1 and date2.
     */
    private static long getDaysBetween(LocalDate date1, LocalDate date2) {
        return ChronoUnit.DAYS.between(date1, date2);
    }

    /**
     * Calculate future date based on current date.
     *
     * @param days the day number to add to the actual date.
     * @return the date created.
     */
    private static LocalDate getFutureDate(final int days) {
        final LocalDate now = LocalDate.now();
        return now.plusDays(days);
    }
}
