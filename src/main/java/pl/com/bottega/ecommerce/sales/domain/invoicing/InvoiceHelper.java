package pl.com.bottega.ecommerce.sales.domain.invoicing;

import pl.com.bottega.ecommerce.sales.domain.productscatalog.ProductData;
import pl.com.bottega.ecommerce.sales.domain.taxes.Tax;
import pl.com.bottega.ecommerce.sharedkernel.Money;

public class InvoiceHelper {

    public static void extendInvoice(Invoice invoice, RequestItem item) {
        Money net = item.getTotalCost();
        Tax tax = TaxHelper.calculateTax(item);
        InvoiceHelper.addLineToInvoice(invoice, item.getProductData(), item.getQuantity(), net, tax);
    }

    private static void addLineToInvoice(Invoice invoice, ProductData product, int quantity, Money net, Tax tax) {
        invoice.addItem(createInvoiceLine(product, quantity, net, tax));
    }

    private static InvoiceLine createInvoiceLine(ProductData product, int quantity, Money net, Tax tax) {
        return new InvoiceLine(product, quantity, net, tax);
    }

}
