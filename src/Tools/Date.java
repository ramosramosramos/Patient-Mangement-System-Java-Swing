
package Tools;

import java.text.SimpleDateFormat;

/**
 *
 * @author User
 */
public class Date {

    public static String getDate(String formatter) {
        java.util.Date now = new java.util.Date();
        SimpleDateFormat format = new SimpleDateFormat(formatter);
        String date = format.format(now);
 
        return date;
    }
}
