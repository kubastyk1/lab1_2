package pl.com.bottega.ecommerce.sales.domain.invoicing;

import pl.com.bottega.ecommerce.sharedkernel.Money;

/**
 * Created by Sasho on 2017-03-12.
 */
public interface TaxCreator {
    Tax createTax(Money money);
}