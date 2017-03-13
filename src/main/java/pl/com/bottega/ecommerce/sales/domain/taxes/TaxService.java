package pl.com.bottega.ecommerce.sales.domain.taxes;

import pl.com.bottega.ecommerce.sales.domain.productscatalog.ProductType;
import pl.com.bottega.ecommerce.sales.domain.taxes.calculators.DrugTaxCalculator;
import pl.com.bottega.ecommerce.sales.domain.taxes.calculators.FoodTaxCalculator;
import pl.com.bottega.ecommerce.sales.domain.taxes.calculators.StandardTaxCalculator;
import pl.com.bottega.ecommerce.sharedkernel.Money;

import java.util.EnumMap;

public class TaxService {
    private static TaxService ourInstance = new TaxService();

    public static TaxService getInstance() {
        if(ourInstance == null) {
            synchronized (TaxService.class) {
                if(ourInstance == null) {
                    ourInstance = new TaxService();
                }
            }
        }
        return ourInstance;
    }

    private final EnumMap<ProductType, ITaxCalculator> calculators = new EnumMap<ProductType, ITaxCalculator>(ProductType.class);

    private TaxService() {
        calculators.put(ProductType.DRUG, new DrugTaxCalculator());
        calculators.put(ProductType.FOOD, new FoodTaxCalculator());
        calculators.put(ProductType.STANDARD, new StandardTaxCalculator());
    }

    public Tax calculateTax(Money netValue, ProductType productType) {
        return calculators.get(productType).calculateTax(netValue);
    }
}
