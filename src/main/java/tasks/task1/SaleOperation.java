package tasks.task1;

import java.util.Calendar;

/**
 * Created by Potaychuk on 12.11.2016.
 */
public class SaleOperation {

    /**
     * Name of product
     */
    private String productName;

    /**
     * Purchase price
     */
    private double priceOfPurchase;

    /**
     * Sale price
     */
    private double priceOfSale;

    /**
     * date of purchase
     */
    private Calendar dateOfPurchase;

    /**
     * date of sale
     */
    private Calendar dateOfSale;

    /**
     * weight
     */
    private double weight;

    /**
     * Default constructor
     */
    public SaleOperation() {
    }

    /**
     * Custom constructor
     * @param productName
     * @param priceOfPurchase
     * @param priceOfSale
     * @param dateOfPurchase
     * @param dateOfSale
     * @param weight
     */
    public SaleOperation(String productName, double priceOfPurchase, double priceOfSale, Calendar dateOfPurchase, Calendar dateOfSale, double weight) {
        this.productName = productName;
        this.priceOfPurchase = priceOfPurchase;
        this.priceOfSale = priceOfSale;
        this.dateOfPurchase = dateOfPurchase;
        this.dateOfSale = dateOfSale;
        this.weight = weight;
    }

    //getters & setters
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPriceOfPurchase() {
        return priceOfPurchase;
    }

    public void setPriceOfPurchase(double priceOfPurchase) {
        this.priceOfPurchase = priceOfPurchase;
    }

    public double getPriceOfSale() {
        return priceOfSale;
    }

    public void setPriceOfSale(double priceOfSale) {
        this.priceOfSale = priceOfSale;
    }

    public Calendar getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(Calendar dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

    public Calendar getDateOfSale() {
        return dateOfSale;
    }

    public void setDateOfSale(Calendar dateOfSale) {
        this.dateOfSale = dateOfSale;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "SaleOperation{" +
                "productName='" + productName + '\'' +
                ", priceOfPurchase=" + priceOfPurchase +
                ", priceOfSale=" + priceOfSale +
                ", dateOfPurchase=" + dateOfPurchase.get(Calendar.YEAR) + "."+
                dateOfPurchase.get(Calendar.MONTH) + "."+
                dateOfPurchase.get(Calendar.DATE) +
                ", dateOfSale=" + dateOfSale.get(Calendar.YEAR) + "."+
                dateOfSale.get(Calendar.MONTH) + "."+
                dateOfSale.get(Calendar.DATE) +
                ", weight=" + weight +
                '}';
    }
}
