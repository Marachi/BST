package tasks;

import org.junit.Test;
import tasks.task1.Income;
import tasks.task1.SaleOperation;
import tasks.task1.incomeCalculator.CustomIncomeCalculator;
import tasks.task1.storage.Storage;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by Potaychuk on 12.11.2016.
 */
public class Task1Test {

    /**
     * Task1 test
     */
    @Test
    public void incomeTest() throws Exception{

        //(1500-1000 - (22-12)*10)*0.5 = 200
        SaleOperation so1 = new SaleOperation("salmon", 1000, 1500, new GregorianCalendar(2016, 9, 12),new GregorianCalendar(2016, 9, 22), 0.5 );
        Income income = new Income(new CustomIncomeCalculator());
        Map testMap = income.getSoldGoods();
        income.addSaleOperation(so1);
        assertEquals(testMap.get("salmon"),200.0);

        //(1500-1000 - (22-12)*10)*1 = 400
        SaleOperation so2 = new SaleOperation("salmon", 1000, 1500, new GregorianCalendar(2016, 9, 12),new GregorianCalendar(2016, 9, 22), 1 );
        income.addSaleOperation(so2);
        assertEquals(testMap.get("salmon"),600.0);

        List<SaleOperation> list = new ArrayList<SaleOperation>();
        list.add(new SaleOperation("carp", 1000, 1500, new GregorianCalendar(2016, 9, 12),new GregorianCalendar(2016, 9, 22), 0.5));//200
        list.add(new SaleOperation("carp", 1000, 1500, new GregorianCalendar(2016, 9, 12),new GregorianCalendar(2016, 9, 22), 0.5));//200
        list.add(new SaleOperation("carp", 1000, 1500, new GregorianCalendar(2016, 9, 12),new GregorianCalendar(2016, 9, 22), 0.5));//200
        list.add(new SaleOperation("salmon", 1000, 1500, new GregorianCalendar(2016, 9, 12),new GregorianCalendar(2016, 9, 22), 0.5));//200

        income.addSaleOperation(list);
        assertEquals(testMap.get("carp"),600.0);
        assertEquals(testMap.get("salmon"),800.0);



    }

}