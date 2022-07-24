package com.designpattern.structural.adapter.payment;

public class Flipkart {

    private PaymentGateway paymentGateway;

    public Flipkart(PaymentGateway paymentGateway){
        this.paymentGateway = paymentGateway;
    }

    public void makePaymentViaCC(String cardNumber, int cvv, int expiryMonth, int expiryYear){

        Long transactionID = paymentGateway.payViaCC(cardNumber,cvv,expiryMonth,expiryYear);

        while (paymentGateway.getStatus(transactionID).equals(PaymentStatus.SUCCESSS)){

        }
    }

}
