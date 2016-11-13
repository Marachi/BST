package tasks.task1;

import tasks.task1.incomeCalculator.IncomeCalculator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Potaychuk on 12.11.2016.
 */
public class Income {

    /**
     * A map of sold goods witch contains name of products and income value
     */
    private Map<String, Double> soldGoods = new HashMap<String, Double>();

    /**
     * An object of IncomeCalculator, witch determines way of income calculating
     */
    private IncomeCalculator incomeCalculator;

    /**
     * Default constructor
     */
    public Income() {
    }

    /**
     * Custom constructor
     */
    public Income(IncomeCalculator incomeCalculator) {
        this.incomeCalculator = incomeCalculator;
    }

    /**
     * This method used for processing sale operation and filling map of sold products in certain way
     * @param saleOperation a single sale operation
     */
    public void addSaleOperation(SaleOperation saleOperation) {
        double temp = incomeCalculator.calculateIncome(saleOperation);
        if (soldGoods.containsKey(saleOperation.getProductName())) {
            temp += soldGoods.get(saleOperation.getProductName());
        }
        soldGoods.put(saleOperation.getProductName(), temp);
    }

    /**
     * This method used for processing sale operation and filling map of sold products in certain way
     * @param saleOperation a list of sale operations
     */
    public void addSaleOperation(List<SaleOperation> saleOperation) {
        for (SaleOperation so:saleOperation) {
            addSaleOperation(so);
        }
    }

    //getters & setters
    public Map<String, Double> getSoldGoods() {
        return soldGoods;
    }

    public void setSoldGoods(Map soldGoods) {
        this.soldGoods = soldGoods;
    }

    public IncomeCalculator getIncomeCalculator() {
        return incomeCalculator;
    }

    public void setIncomeCalculator(IncomeCalculator incomeCalculator) {
        this.incomeCalculator = incomeCalculator;
    }
}
