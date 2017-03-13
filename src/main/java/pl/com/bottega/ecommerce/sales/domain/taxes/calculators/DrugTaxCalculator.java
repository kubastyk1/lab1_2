package pl.com.bottega.ecommerce.sales.domain.taxes.calculators;

public class DrugTaxCalculator extends BaseTaxCalculator {
    protected double getTaxRatio() {
        return 0.05;
    }

    protected String getTaxDescription() {
        return "5% (D)";
    }
}
