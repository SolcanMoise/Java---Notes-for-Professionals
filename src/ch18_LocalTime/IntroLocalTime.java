package ch18_LocalTime;

import java.time.LocalTime;
import java.time.ZoneId;

/**
 * Local Time is an immutable class and thread-safe, used to represent time, often viewed as hour-min-sec.
 * Time is represented to nanosecond precision.
 * <p>
 * This class does not store or represents a date or time-zone. Instead, it is a description of the local time
 * as seem on a wall clock. It cannot represent an instant on the time-line without additional information
 * such as an offset or time-zone. This is a value based class, equals method should be used for comparisons.
 *
 * @author solcanm
 * @version 1.0
 * @since 2019-12-26
 */
public class IntroLocalTime {

    public static void main(String[] args) {

        ZoneId zoneId = ZoneId.of("Asia/Kolkata");
        LocalTime localTime = LocalTime.now();
        LocalTime localTimeKolkata = LocalTime.now(zoneId);
        System.out.println("Default localTime is after localTimeKolkata: " + localTime.isAfter(localTimeKolkata));

        LocalTime substractHoursToLocal = localTime.minusHours(24);
        LocalTime addMinToLocal = substractHoursToLocal.plusMinutes(30);
        System.out.println("Now is: " + addMinToLocal);
    }

}
