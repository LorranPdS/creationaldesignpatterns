package com.lorran.designer.factories.concretecreators;

import com.lorran.designer.factories.PaymentFactory;
import com.lorran.designer.implementations.PixPayment;
import com.lorran.designer.interfaces.Payment;

// Factory Method >>> 4. concrete creators
public class PixPaymentFactory extends PaymentFactory {

    public Payment createPayment() {
        return new PixPayment();
    }
}
