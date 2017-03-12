package pl.com.bottega.ecommerce.sales.domain.taxes;

import pl.com.bottega.ecommerce.sales.domain.productscatalog.ProductType;

public class DrugTaxCalculator extends BaseTaxCalculator {
    protected double getTaxRatio() {
        return 0.05;
    }

    protected String getTaxDescription() {
        return "5% (D)";
    }
}
