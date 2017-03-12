package pl.com.bottega.ecommerce.sales.domain.invoicing;

import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.ClientData;
import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.Id;

/**
 * Created by Sasho on 2017-03-12.
 */
public class InvoiceFactory {
    public static Invoice createInvoice(Id invoiceId, ClientData client){
        return new Invoice(invoiceId, client);
    }
}
