package com.study.refactoring._11_primitive_obsession.replace_conditional_with_polymorphism.swtiches._02_after;

import java.util.List;

public abstract class Employee {
    private List<String> availableProjects;

    public Employee(List<String> availableProjects) {
        this.availableProjects = availableProjects;
    }
    public Employee() {
    }
    public abstract int vacationHours();

    public boolean canAccessTo(String project){
        return this.availableProjects.contains(project);
    }
}
