package com.study.refactoring._20_large_class.extract_superclass._02_after;

import java.util.List;

public class Department extends Party{

    private List<Employee> staff;

    public Department(String name, List<Employee> staff) {
        super(name);
        this.staff = staff;
    }

    public List<Employee> getStaff() {
        return staff;
    }

    public int headCount() {
        return this.staff.size();
    }

    @Override
    public double monthlyCost() {
        return this.staff.stream().mapToDouble(Employee::monthlyCost
        ).sum();
    }
    @Override
    public double annualCost() {
        return this.monthlyCost() * 12;
    }
}
