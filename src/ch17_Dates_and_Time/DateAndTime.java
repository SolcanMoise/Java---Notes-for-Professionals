package ch17_Dates_and_Time;

import java.time.*;

/**
 * Create date and time with different information like timezone or offset.
 *
 * @author solcanm
 * @version 1.0
 * @since 2019-12-26
 */
public class DateAndTime {

    public static void main(String[] args) {

        dateAndTimeWithoutTimeZoneInformation();
        dateAndTimeWithTimeZone();
        dateAndTimeWithOffsetInformations();

    }

    /**
     * Date and time without time zone information.
     */
    private static void dateAndTimeWithOffsetInformations() {
        ZoneOffset offset = ZoneOffset.ofHours(2);
        OffsetDateTime dateTime = OffsetDateTime.of(1997, 8, 3, 14, 24, 33, 34, offset);
        OffsetDateTime now = OffsetDateTime.now(); // Offset taken from the default ZoneId
        OffsetDateTime parsed = OffsetDateTime.parse("2019-12-26T17:54:24+02:00");
    }

    /**
     * Date and time with time zone information.
     */
    private static void dateAndTimeWithTimeZone() {
        ZoneId zoneId = ZoneId.of("UTC+2");
        ZonedDateTime dateTime = ZonedDateTime.of(1997, 8, 3, 14, 24, 33, 45, zoneId);
        ZonedDateTime now = ZonedDateTime.now(); // Default time zone.
    }

    /**
     * Date and time with offset information.
     */
    private static void dateAndTimeWithoutTimeZoneInformation() {
        LocalDateTime dateTime = LocalDateTime.of(1997, Month.AUGUST, 3, 12, 20);
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime dateParsed = LocalDateTime.parse("2016-07-27T07:00:00");
    }
}
