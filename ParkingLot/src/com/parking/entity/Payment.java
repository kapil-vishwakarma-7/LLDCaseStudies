package com.parking.entity;

import java.util.Date;

public class Payment {
    private Bill bill;
    private PaymentMode paymentMode;
    private PaymentStatus paymentStatus;
    private String bankReferenceNumber;
    private Date paymentTime;
}
