package com.study.refactoring._11_primitive_obsession.replace_type_code_with_subclasses.direct_inheritance._02_after;

public class Manager extends Employee {
    public Manager(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "manager";
    }
}
