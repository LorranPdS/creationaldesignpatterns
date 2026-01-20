package com.lorran.designer.implementations;

import com.lorran.designer.interfaces.Payment;

// Factory Method >>> 2. Concrete products
public class PixPayment implements Payment {

    public void pay(double value) {
        System.out.println("Paying US$ " + value +" using PIX");
    }
}
