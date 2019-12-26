package ch17_Dates_and_Time;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Calculate difference between 2 LocalDates.
 *
 * @author solcanm
 * @version 1.0
 * @since 2019-12-26
 */
public class DiffBetweenLocalDates {

    public static void main(String[] args) {

        LocalDate d1 = LocalDate.of(1997, 8, 3);
        LocalDate d2 = LocalDate.of(1997, 8, 5);

        long days = ChronoUnit.DAYS.between(d1, d2);

        System.out.println("Is " + days + " days between date1 and date2");
    }
}
