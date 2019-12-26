package ch18_LocalTime;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * Amount of time between two LocalTime.
 *
 * @author solcanm
 * @version 1.0
 * @since 2019-12-26
 */
public class AmountOfTime {

    public static void main(String[] args) {
        checkStaticMethods();

        LocalTime start = LocalTime.of(10, 0, 0);
        LocalTime end = LocalTime.of(11, 20, 0);

        final ChronoUnit hours = ChronoUnit.HOURS;

        long hourDist1 = getDistanceThroughUntil(start, end, hours);
        long hourDist2 = getDistanceThroughBetween(start, end, hours);

        System.out.println("The distance in hours(with until) between start:" + start + " and end:" + end + " is: " + hourDist1);
        System.out.println("The distance in hours(with between) between start:" + start + " and end:" + end + " is: " + hourDist2);
    }

    private static long getDistanceThroughBetween(LocalTime start, LocalTime end, ChronoUnit unit) {
        return unit.between(start, end);
    }

    private static long getDistanceThroughUntil(LocalTime start, LocalTime end, ChronoUnit unit) {
        return start.until(end, unit);
    }


    private static void checkStaticMethods() {
        final LocalTime of = LocalTime.of(13, 12, 11); // 13:12:11
        final LocalTime midnight = LocalTime.MIDNIGHT; // 00:00
        final LocalTime noon = LocalTime.NOON; // 12:00
        final LocalTime now = LocalTime.now(); // Current time from system clock.
        final LocalTime max = LocalTime.MAX; // The maximum supported local time 23:59:59:999999999
        final LocalTime min = LocalTime.MIN; // The minimum supported local time 00:00
        final LocalTime secondOfDay = LocalTime.ofSecondOfDay(84399); // 23:59:59
        final LocalTime nanoOfDay = LocalTime.ofNanoOfDay(2000000000); // 00:00:02
    }
}
