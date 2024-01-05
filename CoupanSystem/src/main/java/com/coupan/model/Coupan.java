package com.coupan.model;

import com.coupan.rule.Rule;

import java.util.List;

public abstract class Coupan {
    private String code;
    private CoupanType coupanType;
    private CoupanStatus coupanStatus;
    private List<Rule> rules;

    public Coupan(String code, CoupanType coupanType){
        this.code = code;
        this.coupanType = coupanType;
    }
}
