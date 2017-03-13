package pl.com.bottega.ecommerce.sales.domain.payment;

import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.ClientData;
import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.Id;
import pl.com.bottega.ecommerce.sharedkernel.Money;

/**
 * Created by Zehiel on 12.03.2017.
 */
public class PaymentFactory {

    public static Payment create(ClientData clientData, Money money){

        Id id = Id.generate(); // pregeneration of id

        return new Payment(id,clientData, money);
    }
}
