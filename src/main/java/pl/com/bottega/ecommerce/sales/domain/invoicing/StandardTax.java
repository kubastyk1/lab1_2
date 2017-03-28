package pl.com.bottega.ecommerce.sales.domain.invoicing;

import pl.com.bottega.ecommerce.sharedkernel.Money;

public class StandardTax implements TaxCreator{

	public Tax createTax(Money money) {
		return TaxFactory.createTax(money.multiplyBy(0.23), "23%");
	}

}
