package com.designpattern.structural.adapter.payment;

import com.designpattern.structural.adapter.payment.razorpay.RazorPayGateway;

public class RazorpayPaymentGatewayAdapter implements PaymentGateway{

    private RazorPayGateway razorPayGateway;

    public RazorpayPaymentGatewayAdapter(){
        this.razorPayGateway = new RazorPayGateway();
    }

    @Override
    public Long payViaCC(String cardNumber, int cvv, int expiryMonth, int expiryYear) {
        String cvvString = String.valueOf(cvv);
        String expiry = String.valueOf(expiryMonth) + "/" + String.valueOf(expiryYear);
        String transactionID = this.razorPayGateway.payByCreditCard(cardNumber,cvvString,expiry);
        return Long.parseLong(transactionID);
    }

    @Override
    public PaymentStatus getStatus(Long id) {
        boolean status = razorPayGateway.checkPaymentStatus(String.valueOf(id));
        if (status){
            return PaymentStatus.SUCCESSS;
        }
        return PaymentStatus.FAILURE;
    }
}
