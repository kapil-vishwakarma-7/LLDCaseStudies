package com.designpattern.structural.adapter.payment;


public class Client {
    public static void main(String[] args) {
        Flipkart flipkart = new Flipkart(new RazorpayPaymentGatewayAdapter());
        flipkart.makePaymentViaCC("1122 2132 2123 1232", 109, 12,2026);


    }
}
