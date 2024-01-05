package com.coupan.model;

public class PercentCoupan extends Coupan{
    private double percentOff;
    private double maxOff;

    public PercentCoupan(String code, double percentOff, double maxOff){
        super(code, CoupanType.AMOUNT);
        this.maxOff = maxOff;
        this.percentOff = percentOff;
    }
}
