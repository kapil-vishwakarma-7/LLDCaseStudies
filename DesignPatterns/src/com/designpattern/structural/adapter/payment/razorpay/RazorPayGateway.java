package com.designpattern.structural.adapter.payment.razorpay;

public class RazorPayGateway {
    public String payByCreditCard(String cardNumber, String cvv, String expiry){
        System.out.println("Payment done with RazorPay");
        return "123";
    }
    public boolean checkPaymentStatus(String id){
        return false;
    }
}
