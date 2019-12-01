package ch16_Date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author solcanm
 * @version 1.0
 * @since 2019-12-01
 */
public class BasicDate {

    public static void main(String[] args) {

        // get the current date object
        Date date = Calendar.getInstance().getTime();

        // define the format to use
        String format = "dd/MM/yyyy hh:mm:ss";

        // create the formatter
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);

        // format the date
        String formattedDate = dateFormat.format(date);

        // print it
        System.out.println(formattedDate);

        //  single line version of all above code
        System.out.println(new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").format(Calendar.getInstance().getTime()));
    }
}
