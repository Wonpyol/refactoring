package com.study.refactoring._06_mutable_data.split_variable._02_after;

public class Order {

    public double discount(double inputValue, int quantity) {
        double discountValue = inputValue;
        if (inputValue > 50) discountValue = inputValue - 2;
        if (quantity > 100) discountValue = inputValue - 1;
        return discountValue;
    }
}
