package tasks.task4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Potaychuk on 13.11.2016.
 */
public class BirthDayInfo {

    /**
     * This method returns day's name of given date
     * @param day
     * @param month
     * @param year
     * @return
     */
    public static String getWeekday(int day, int month, int year){
        String days[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int a = (14 - month) / 12, y = year - a, m = month + 12 * a - 2;
        return days[(7000 + (day + y + y / 4 - y / 100 + y / 400 + (31 * m) / 12)) % 7];
    }

    /**
     * This method returns count of days between today's date and given
     * @param day
     * @param month
     * @param year
     * @return
     */
    public static int getDays(int day, int month, int year){
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        int result =0;
        Date date1;
        Date date2 = new Date();
        try {
            date1 = format.parse(""+day+"."+month+"."+year);
            long difference = date2.getTime() - date1.getTime();
           result = (int) (difference / (24 * 60 * 60 * 1000));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * This method returns count of months between today's date and given
     * @param day
     * @param month
     * @param year
     * @return
     */
    public static int getMonth(int day, int month, int year){
        Calendar gc1 = Calendar.getInstance();
        int currentMonth = gc1.get(Calendar.MONTH)+1;
        int currentYear = gc1.get(Calendar.YEAR);
        int temp = -gc1.get(Calendar.DAY_OF_MONTH)+day;
        return temp<=0?
                (currentYear-year)*12+currentMonth-month :
                (currentYear-year)*12+currentMonth-month-1;
    }

}
