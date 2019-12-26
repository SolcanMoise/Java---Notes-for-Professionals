package ch17_Dates_and_Time;

import java.time.*;

import static java.time.ZoneId.SHORT_IDS;

/**
 * Usage of various classes of Date Time API.
 *
 * @author solcanm
 * @version 1.0
 * @since 2019-12-26
 */
public class DateTimeAPI {

    public static void main(String[] args) {
        checkLocalDateTime();
        checkLocalDate();
        checkClock();
        checkInstant();
        checkDuration();
        checkLocalTime();
        checkZonedDateTime();
    }

    /**
     * Has the methods of {@link LocalDateTime}.
     */
    private static void checkLocalDateTime() {

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Local Date Time using static now() method ::: " + localDateTime);

        LocalDateTime localDateTime1 = LocalDateTime.now(ZoneId.of(SHORT_IDS.get("AET")));
        System.out.println("Local Date Time using now(ZoneId zoneId) method ::: " + localDateTime1);

        LocalDateTime localDateTime2 = LocalDateTime.now(Clock.system(ZoneId.of(SHORT_IDS.get("ART"))));
        System.out.println("Local Date Time using now(Clock.system(ZoneId.of())) method ::: " + localDateTime2);
    }

    /**
     * This has the methods of the class {@link LocalDate}.
     */
    private static void checkLocalDate() {
        LocalDate localDate = LocalDate.now();
        System.out.println("Gives date without time using now() method ::: " + localDate);

        LocalDate localDate1 = LocalDate.now(ZoneId.of(SHORT_IDS.get("CST")));
        System.out.println("get time using different timezones using now(ZoneId.of()) method ::: " + localDate1);
    }

    /**
     * This has the methods of abstract class {@link Clock}. Clock can be used for time which
     * has time with {@link java.util.TimeZone}.
     */
    private static void checkClock() {
        Clock clock = Clock.systemUTC();
        System.out.println("Time using clock class ::: " + clock);
    }

    private static void checkInstant() {
        Instant instant = Instant.now();
        System.out.println("Instant using now() method ::: " + instant);
        Instant instant1 = Instant.now(Clock.systemUTC());
        System.out.println("Instant using now(Clock clock) method ::: " + instant1);
    }

    /**
     * This has the method of the {@link Duration} class.
     */
    private static void checkDuration() {
        System.out.println("Duration ::: " + Duration.ofDays(2));
    }

    /**
     * Shows local date without time. It doesn't store or represents a date and time.
     * Instead its a representation of Time like clock on the wall.
     */
    private static void checkLocalTime() {
        LocalTime localTime = LocalTime.now();
        System.out.println("LocalTime using now() method ::: " + localTime);
    }

    /**
     * A date time with Time zone details in ISO-8601 standards.
     */
    private static void checkZonedDateTime() {
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of(SHORT_IDS.get("CST")));
        System.out.println("ZonedDateTime ::: " + zonedDateTime);
    }
}
