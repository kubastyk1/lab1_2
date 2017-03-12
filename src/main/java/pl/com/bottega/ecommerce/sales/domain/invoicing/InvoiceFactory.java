package pl.com.bottega.ecommerce.sales.domain.invoicing;

import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.ClientData;
import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.Id;

/**
 * User: Klaudia
 * Date: 12.03.2017
 * Time: 22:53
 */
public class InvoiceFactory implements InvoiceFactoryImpl{

    public Invoice create(Id invoiceId, ClientData client) {
        return new Invoice(invoiceId, client);
    }
}
