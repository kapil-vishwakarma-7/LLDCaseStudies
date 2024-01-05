package com.coupan.rule;

public class CartValueRule implements Rule<Double>{

    private Double cartValue;

    public CartValueRule(Double cartValue){
        this.cartValue = cartValue;
    }

    @Override
    public boolean validate(Double value) {
        return value >= this.cartValue;
    }
}
