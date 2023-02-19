package com.study.refactoring._11_primitive_obsession.repliace_primitive_with_object._01_before;

public class Order {

    private String priority;

    public Order(String priority) {
        this.priority = priority;
    }

    public String getPriority() {
        return priority;
    }
}
