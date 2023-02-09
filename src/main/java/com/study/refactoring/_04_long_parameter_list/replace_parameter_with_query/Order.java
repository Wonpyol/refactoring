package com.study.refactoring._04_long_parameter_list.replace_parameter_with_query;

public class Order {

    private int quantity;

    private double itemPrice;

    public Order(int quantity, double itemPrice) {
        this.quantity = quantity;
        this.itemPrice = itemPrice;
    }

    public double finalPrice() {
        return this.discountedPrice();
    }

    private int getDiscountLevel() {
        return this.quantity > 100 ? 2 : 1;
    }

    private double getBasePrice() {
        return this.quantity * this.itemPrice;
    }

    private double discountedPrice() {
        return getDiscountLevel() == 2 ? getBasePrice() * 0.9 : getBasePrice() * 0.95;
    }
}
