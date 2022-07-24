package com.parking.entity;

import java.util.Date;

public class Bill {
    private Ticket ticket;
    private ExitGate exitGate;
    private Date exitTime;
    private Double charge;
    private BillPaymentStatus billPaymentStatus;
}
