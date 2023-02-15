package com.study.refactoring._08_shotgun_surgery.move_field._02_after;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Customer {

    private String name;
    private CustomerContract contract;

    public Customer(String name, double discountRate) {
        this.name = name;
        this.contract = new CustomerContract(dateToday(), discountRate);
    }

    public double getDiscountRate() {
        return contract.getDiscountRate();
    }

    public void becomePreferred() {
        contract.setDiscountRate(this.getDiscountRate() + 0.03);
        // 다른 작업들
    }

    public double applyDiscount(double amount) {
        BigDecimal value = BigDecimal.valueOf(amount);
        return value.subtract(value.multiply(BigDecimal.valueOf(this.getDiscountRate()))).doubleValue();
    }

    private LocalDate dateToday() {
        return LocalDate.now();
    }
}
