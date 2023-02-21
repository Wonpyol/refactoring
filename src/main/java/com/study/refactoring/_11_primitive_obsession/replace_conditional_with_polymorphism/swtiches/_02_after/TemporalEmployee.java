package com.study.refactoring._11_primitive_obsession.replace_conditional_with_polymorphism.swtiches._02_after;

import java.util.List;

public class TemporalEmployee extends Employee {
    public TemporalEmployee(List<String> availableProjects) {
        super("temporal", availableProjects);
    }

    @Override
    public int vacationHours() {
        return 32;
    }

    @Override
    public boolean canAccessTo(String type) {
        return getAvailableProjects().contains(type);
    }

}
