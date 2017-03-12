package pl.com.bottega.ecommerce.sales.domain.payment;

import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.ClientData;
import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.Id;
import pl.com.bottega.ecommerce.sharedkernel.Money;

/**
 * Created by Maciek on 12.03.2017.
 */
public class PaymentFactory {

    public static Payment create(ClientData clientData, Money money) {

        Id id = Id.generate();

        return new Payment(id, clientData, money);
    }
}
