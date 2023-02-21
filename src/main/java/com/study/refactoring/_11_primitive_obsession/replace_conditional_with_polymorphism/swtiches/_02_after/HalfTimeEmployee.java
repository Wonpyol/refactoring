package com.study.refactoring._11_primitive_obsession.replace_conditional_with_polymorphism.swtiches._02_after;

import java.util.List;

public class HalfTimeEmployee extends Employee{
    public HalfTimeEmployee(List<String> availableProjects) {
        super("halftime", availableProjects);
    }

    @Override
    public int vacationHours() {
        return 80;
    }

    @Override
    public boolean canAccessTo(String type) {
        return getAvailableProjects().contains(type);
    }
}
