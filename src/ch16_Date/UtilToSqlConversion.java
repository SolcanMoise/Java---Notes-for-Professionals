package ch16_Date;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * {@link java.util.Date} to {@link java.sql.Date} conversion is usually necessary when a Date object is needs to
 * be written in a database.
 * <p>
 * {@link java.sql.Date} is a wrapper around milliseconds value and is used by JDBC to identify an SQL Date type.
 * <p>
 * {@link java.util.Date} has both date and time information, whereas {@link java.sql.Date} only has date information.
 *
 * @author solcanm
 * @version 1.0
 * @since 2019-12-01
 */
public class UtilToSqlConversion {

    public static void main(String[] args) {

        // java.util.Date
        java.util.Date utilDate = new java.util.Date();
        System.out.println("java.util.Date = " + utilDate);

        // java.sql.Date
        java.sql.Date sqlDate = convert(utilDate);
        System.out.println("java.sql.Date = " + sqlDate);

        // Format date
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy - hh:mm:ss");
        System.out.println("Formatted date is: " + dateFormat.format(utilDate));
    }

    /**
     * Convert from {@link java.util.Date} to {@link java.sql.Date}
     *
     * @param utilDate the date to be transformed
     * @return the {@link java.sql.Date} resulted after transformation.
     */
    private static Date convert(java.util.Date utilDate) {
        return new java.sql.Date(utilDate.getTime());
    }
}
