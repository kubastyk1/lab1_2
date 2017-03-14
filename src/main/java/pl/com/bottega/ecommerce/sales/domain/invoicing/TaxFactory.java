package pl.com.bottega.ecommerce.sales.domain.invoicing;

import pl.com.bottega.ecommerce.sharedkernel.Money;

public class TaxFactory {

	public static Tax creatTax(Money amount, String description){
        return new Tax(amount, description);
    }

}
