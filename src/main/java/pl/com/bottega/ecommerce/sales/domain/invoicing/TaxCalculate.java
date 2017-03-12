package pl.com.bottega.ecommerce.sales.domain.invoicing;

import pl.com.bottega.ecommerce.sales.domain.productscatalog.ProductType;
import pl.com.bottega.ecommerce.sharedkernel.Money;

/**
 * Created by Maciek on 12.03.2017.
 */
public interface TaxCalculate {

    Tax calculate(ProductType productType, Money money);
}
