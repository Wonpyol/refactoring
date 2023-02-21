package com.study.refactoring._11_primitive_obsession.replace_type_code_with_subclasses.indirect_inheritance._02_after;

import com.study.refactoring._11_primitive_obsession.replace_type_code_with_subclasses.direct_inheritance._02_after.Employee;

public class Salesman extends Employee {
    public Salesman(String name) {
        super(name, "salesman");
    }


}
