package pl.com.bottega.ecommerce.sales.domain.invoicing;

import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.ClientData;

/**
 * User: Klaudia
 * Date: 12.03.2017
 * Time: 23:31
 */
public interface InvoiceFactoryImpl {
    public Invoice create(ClientData client);
}
