package com.study.refactoring._11_primitive_obsession.replace_conditional_with_polymorphism.swtiches._02_after;

import java.util.List;

public class HalfTimeEmployee extends Employee{
    public HalfTimeEmployee(List<String> availableProjects) {
        super(availableProjects);
    }

    @Override
    public int vacationHours() {
        return 80;
    }
}
