package pl.com.bottega.ecommerce.sales.domain.invoicing;

import pl.com.bottega.ecommerce.sharedkernel.Money;

/**
 * Created by Sasho on 2017-03-12.
 */
public class FoodTaxCreator implements TaxCreator {
    public Tax createTax(Money money) {
        return new Tax(money.multiplyBy(0.07), "7% (F)");
    }
}
