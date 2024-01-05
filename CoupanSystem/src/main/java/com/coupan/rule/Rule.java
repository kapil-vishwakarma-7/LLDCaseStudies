package com.coupan.rule;

public interface Rule<T> {
    public boolean validate(T value);
}
