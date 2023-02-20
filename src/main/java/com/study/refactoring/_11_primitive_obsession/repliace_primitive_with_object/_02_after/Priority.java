package com.study.refactoring._11_primitive_obsession.repliace_primitive_with_object._02_after;

import java.util.List;

public class Priority {
    private String value;
    List<String> legalValues = List.of("low", "normal", "high", "rush");
    public Priority(String value) {
        if (legalValues.contains(value)) {
            this.value = value;
        } else {
            throw new IllegalArgumentException("illegal value:"+ value);
        }
    }

    public boolean higherThan(Priority other) {
        return this.index() > other.index();
    }

    private int index() {
        return this.legalValues.indexOf(this.value);
    }

    @Override
    public String toString() {
        return this.value;
    }
}
