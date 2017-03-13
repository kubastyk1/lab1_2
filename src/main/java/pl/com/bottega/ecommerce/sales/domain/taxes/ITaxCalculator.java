package pl.com.bottega.ecommerce.sales.domain.taxes;

import pl.com.bottega.ecommerce.sales.domain.productscatalog.ProductType;
import pl.com.bottega.ecommerce.sharedkernel.Money;

public interface ITaxCalculator {
    Tax calculateTax(Money netValue);
}
