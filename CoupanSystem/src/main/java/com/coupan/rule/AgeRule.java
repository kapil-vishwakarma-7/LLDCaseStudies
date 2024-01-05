package com.coupan.rule;

public class AgeRule implements Rule<Integer>{
    private int age;
    public AgeRule(int age){
        this.age = age;
    }

    @Override
    public boolean validate(Integer age) {
        return age >= this.age;
    }
}
