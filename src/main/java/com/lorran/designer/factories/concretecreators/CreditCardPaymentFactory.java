package com.lorran.designer.factories.concretecreators;

import com.lorran.designer.factories.PaymentFactory;
import com.lorran.designer.implementations.CreditCardPayment;
import com.lorran.designer.interfaces.Payment;

// Factory Method >>> 4. concrete creators
public class CreditCardPaymentFactory extends PaymentFactory {

    public Payment createPayment() {
        return new CreditCardPayment();
    }
}
