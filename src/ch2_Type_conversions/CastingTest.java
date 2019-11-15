package ch2_Type_conversions;

import java.util.Calendar;
import java.util.Date;

/**
 * Test if an object can be cast using instanceof
 *
 * @author solcanm
 * @version 1.0
 * @since 2019-11-15
 */
public class CastingTest {

    public static void main(String[] args) {
        Object object = Calendar.getInstance();
        Date timeCalendar;
        Long timeLong;

        if(object instanceof Calendar){
            timeCalendar = ((Calendar) object).getTime();
        }
        if(object instanceof Date){
            timeLong = ((Date) object).getTime();
        }
        System.out.println(object); // object type is GregorianCalendar
    }
}
