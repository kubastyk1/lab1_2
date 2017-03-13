package pl.com.bottega.ecommerce.sales.domain.taxes.calculators;

public class StandardTaxCalculator extends BaseTaxCalculator {
    protected double getTaxRatio() {
        return 0.23;
    }

    protected String getTaxDescription() {
        return "23%";
    }
}
