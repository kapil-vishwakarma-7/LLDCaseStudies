package com.designpattern.structural.adapter.payment.payu;

public class PayUGateway {

    public String payByCreditCard(String cardNumber, Long cvv, Long expiry){
        System.out.println("Payment done with PayU");
        return "123";
    }
    public boolean checkPaymentStatus(String id){
        return false;
    }
}
