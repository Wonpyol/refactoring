package com.study.refactoring._11_primitive_obsession.replace_conditional_with_polymorphism.swtiches._02_after;

import java.util.List;

public abstract class Employee {
    private String type;
    private List<String> availableProjects;

    public Employee(String type, List<String> availableProjects) {
        this.type = type;
        this.availableProjects = availableProjects;
    }

    public abstract int vacationHours();

    public abstract boolean canAccessTo(String project);

    public List<String> getAvailableProjects() {
        return availableProjects;
    }
}
