package tasks;

import org.junit.Test;
import tasks.task4.BirthDayInfo;

import static org.junit.Assert.*;

/**
 * Created by Potaychuk on 13.11.2016.
 */
public class Task4Test {


    @Test
    public void getWeekdayTest() throws Exception {
        assertEquals(BirthDayInfo.getWeekday(13,6,1992), "Saturday");
    }

    @Test
    public void getDaysTest() throws Exception {
        //8919 - valid number on 13.11.2016
        assertTrue(BirthDayInfo.getDays(13,6,1992)>=8919);
    }

    @Test
    public void getMonthTest() throws Exception {
        //293 - valid number on 13.11.2016
        assertTrue(BirthDayInfo.getMonth(13,6,1992)>=293);
    }

}