package com.designpattern.structural.decorator.pizzaStore;

public interface Pizza {
    void addToppings(Topping topping);
    Long getCost();
}
