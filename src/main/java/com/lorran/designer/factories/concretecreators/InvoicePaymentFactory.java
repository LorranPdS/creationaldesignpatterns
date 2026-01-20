package com.lorran.designer.factories.concretecreators;

import com.lorran.designer.factories.PaymentFactory;
import com.lorran.designer.implementations.Invoice;
import com.lorran.designer.interfaces.Payment;

// Factory Method >>> 4. concrete creators
public class InvoicePaymentFactory extends PaymentFactory {

    public Payment createPayment() {
        return new Invoice();
    }
}
