package pl.com.bottega.ecommerce.sales.domain.invoicing;

import pl.com.bottega.ecommerce.sales.domain.productscatalog.ProductType;
import pl.com.bottega.ecommerce.sharedkernel.Money;

/**
 * User: Klaudia
 * Date: 13.03.2017
 * Time: 01:08
 */
public interface TaxPolicyImpl {
    public Tax calculateTax(ProductType productType, Money net);
}
