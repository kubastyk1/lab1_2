package pl.com.bottega.ecommerce.sales.domain.invoicing;

import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.ClientData;
import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.Id;

/**
 * Created by Maciek on 12.03.2017.
 */
public class InvoiceFactory {

    public static Invoice create(ClientData clientData) {
        Id id = Id.generate();
        return new Invoice(id, clientData);
    }
}
