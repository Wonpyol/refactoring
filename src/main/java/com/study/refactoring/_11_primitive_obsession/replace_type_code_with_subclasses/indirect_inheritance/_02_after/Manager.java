package com.study.refactoring._11_primitive_obsession.replace_type_code_with_subclasses.indirect_inheritance._02_after;

public class Manager extends Employee {
    public Manager(String name) {
        super(name, "manager");
    }
}
