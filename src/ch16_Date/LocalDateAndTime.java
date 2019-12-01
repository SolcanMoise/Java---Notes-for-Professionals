package ch16_Date;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

/**
 * {@link java.util.Date} and {@link java.time.LocalDate} objects cannot be exactly converted between each other
 * since a Date represents both a specific date and time, while a LocalDate object does not contain time or
 * timezone information.
 *
 * @author solcanm
 * @version 1.0
 * @since 2019-12-01
 */
public class LocalDateAndTime {


    public static void main(String[] args) {

        /** Create a local date */
        LocalDate defaultLocalDate = LocalDate.now();

        LocalDate valuesLocalDate = LocalDate.of(2019, 12, 1);

        LocalDate stringLocalDate = LocalDate.parse("2019-12-01");

        LocalDate zoneLocalDate = LocalDate.now(ZoneId.systemDefault());


        /** Create a local date time */
        LocalDateTime defaultLocalDatetime = LocalDateTime.now();

        LocalDateTime valuesLocalDatetime = LocalDateTime.of(2019, 12, 1, 9, 14);

        LocalDateTime stringLocalDatetime = LocalDateTime.parse("2019-12-01T12:30:31");

        LocalDateTime zoneLocalDatetime = LocalDateTime.now(ZoneId.systemDefault());


        /** Create a date and a zone */
        Date date = Date.from(Instant.now());
        ZoneId zoneId = ZoneId.systemDefault();

        /** LocalDate to Date and vice-versa */
        LocalDate localDate = date.toInstant().atZone(zoneId).toLocalDate();
        Date date1 = Date.from(localDate.atStartOfDay(zoneId).toInstant());

        /** LocalDateTime to Date and vice-versa */
        LocalDateTime localDateTime = date.toInstant().atZone(zoneId).toLocalDateTime();
        Date date2 = Date.from(localDateTime.atZone(zoneId).toInstant());
    }
}
