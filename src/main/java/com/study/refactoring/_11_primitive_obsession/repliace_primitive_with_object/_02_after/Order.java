package com.study.refactoring._11_primitive_obsession.repliace_primitive_with_object._02_after;

public class Order {
    private Priority priorityValue;
    public Order(Priority priorityValue) {
        this.priorityValue = priorityValue;
    }

    public Priority getPriorityValue() {
        return priorityValue;
    }
}
