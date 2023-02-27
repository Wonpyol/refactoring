package com.study.refactoring._16_temporary_field.introduce_special_case._02_after;

public class NullPaymentHistory extends PaymentHistory{
    public NullPaymentHistory() {
        super(0);
    }
}
