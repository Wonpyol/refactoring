package com.study.refactoring._11_primitive_obsession.replace_type_code_with_subclasses.indirect_inheritance._02_after;

public class EmployeeType {
    public String capitalizedType() {
        return this.toString().substring(0, 1).toUpperCase() + this.toString().substring(1).toLowerCase();
    }
}
