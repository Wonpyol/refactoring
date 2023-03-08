package com.study.refactoring._24_comments.introduce_assertion._02_after;

public class Customer {

    private Double discountRate;

    public double applyDiscount(double amount) {
        return (this.discountRate != null) ? amount - (this.discountRate * amount) : amount;
    }

    public Double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(Double discountRate) {
        assert discountRate != null && discountRate > 0;//표현하기 용도에는 주석보다는 assert 가 좋을 수 있음
        this.discountRate = discountRate;
    }
}
