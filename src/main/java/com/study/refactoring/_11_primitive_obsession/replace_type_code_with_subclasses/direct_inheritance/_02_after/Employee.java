package com.study.refactoring._11_primitive_obsession.replace_type_code_with_subclasses.direct_inheritance._02_after;

import java.util.List;

public class Employee {
    private String name;

    private String type;

    public Employee(String name, String type) {
        this.name = name;
        this.type = type;
    }

    private void validate(String type) {
        List<String> legalTypes = List.of("engineer", "manager", "salesman");
        if (!legalTypes.contains(type)) {
            throw new IllegalArgumentException(type);
        }
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
