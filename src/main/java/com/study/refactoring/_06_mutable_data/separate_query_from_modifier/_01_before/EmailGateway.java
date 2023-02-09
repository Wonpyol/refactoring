package com.study.refactoring._06_mutable_data.separate_query_from_modifier._01_before;

public class EmailGateway {
    public void send(String bill) {
        System.out.println(bill);
    }
}
