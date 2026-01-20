package com.lorran.designer.factories;

import com.lorran.designer.interfaces.Payment;

// Factory Method >>> 3. creator
public abstract class PaymentFactory {

    // Factory Method
    public abstract Payment createPayment();

    public void processPayment(double valor) {
        Payment payment = createPayment();
        payment.pay(valor);
    }
}
