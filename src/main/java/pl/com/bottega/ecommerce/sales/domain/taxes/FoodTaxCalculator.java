package pl.com.bottega.ecommerce.sales.domain.taxes;

public class FoodTaxCalculator extends BaseTaxCalculator {
    protected double getTaxRatio() {
        return 0.07;
    }

    protected String getTaxDescription() {
        return "7% (F)";
    }
}
