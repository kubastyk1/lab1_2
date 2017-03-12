package pl.com.bottega.ecommerce.sales.domain.invoicing;

import pl.com.bottega.ecommerce.sales.domain.taxes.Tax;
import pl.com.bottega.ecommerce.sales.domain.taxes.TaxService;

public class TaxHelper {

    public static Tax calculateTax(RequestItem item) {
        return TaxService.getInstance().calculateTax(item.getTotalCost(), item.getProductData().getType());
    }

}
