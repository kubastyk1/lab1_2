package pl.com.bottega.ecommerce.sales.domain.taxes.calculators;

import pl.com.bottega.ecommerce.sales.domain.taxes.ITaxCalculator;
import pl.com.bottega.ecommerce.sales.domain.taxes.Tax;
import pl.com.bottega.ecommerce.sharedkernel.Money;

public abstract class BaseTaxCalculator implements ITaxCalculator {
    public Tax calculateTax(Money netValue) {
        String desc = getTaxDescription();
        Money taxValue = netValue.multiplyBy(getTaxRatio());
        return new Tax(taxValue, desc);
    }

    protected abstract double getTaxRatio();

    protected abstract String getTaxDescription();
}
