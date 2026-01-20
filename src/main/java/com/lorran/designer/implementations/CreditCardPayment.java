package com.lorran.designer.implementations;

import com.lorran.designer.interfaces.Payment;

// Factory Method >>> 2. Concrete products
public class CreditCardPayment implements Payment {

    public void pay(double value) {
        System.out.println("Paying US$ " + value +" with credit card");
    }
}
