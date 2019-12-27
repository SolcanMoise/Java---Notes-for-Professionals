package ch21_NumberFormat;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Different countries have different number formats and considering this we can have different formats
 * using {@link java.util.Locale} of Java.
 *
 * @author solcanm
 * @version 1.0
 * @since 2019-12-27
 */
public class NumberFormatClass {

    public static void main(String[] args) {

        Locale locale = new Locale("en", "IN");

        // format number
        NumberFormat numberFormat = NumberFormat.getInstance(locale);
        numberFormat.format(10000000.999);

        // format currency
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);
        currencyFormat.format(1234.5678);

        // format percentage
        NumberFormat percentageFormat = NumberFormat.getPercentInstance(locale);
        percentageFormat.format(109234.7583233);
    }
}
