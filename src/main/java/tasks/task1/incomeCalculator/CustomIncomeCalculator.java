package tasks.task1.incomeCalculator;

import tasks.task1.SaleOperation;
import tasks.task1.storage.Storage;

/**
 * Created by Potaychuk on 12.11.2016.
 */
public class CustomIncomeCalculator implements IncomeCalculator{

    public double calculateIncome(SaleOperation saleOperation) {
        return ((saleOperation.getPriceOfSale()-saleOperation.getPriceOfPurchase()-
                ((saleOperation.getDateOfSale().getTimeInMillis() -  saleOperation.getDateOfPurchase().getTimeInMillis())/1000/3600/24)*
                        Storage.overHead))*saleOperation.getWeight();
    }
}
