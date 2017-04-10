package pl.com.bottega.ecommerce.sales.domain.invoicing;

import pl.com.bottega.ecommerce.sales.domain.productscatalog.ProductType;
import pl.com.bottega.ecommerce.sharedkernel.Money;

public class TaxCalculator implements ITaxCalculator {

	public Tax calculateTax(ProductType type, Money price) {
		TaxCreator creator;
		switch (type) {
		case DRUG:
			creator = new DrugTax();
			break;
		case FOOD:
			creator = new FoodTax();
			break;
		case STANDARD:
			creator = new StandardTax();
			break;

		default:
			throw new IllegalArgumentException();
		}
		return creator.createTax(price);
	}
}
