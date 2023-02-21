package com.study.refactoring._11_primitive_obsession.replace_type_code_with_subclasses.indirect_inheritance._02_after;

public class Employee {

    private final String name;

    private final EmployeeType type;

    public Employee(String name, String type) {
        this.name = name;
        this.type = employeeType(type);
    }

    private EmployeeType employeeType(String type) {
        return switch (type) {
            case "engineer" -> new Engineer();
            default -> throw new IllegalArgumentException("not found type:" + type);
        };
    }

    public String capitalizedType() {
        return this.type.capitalizedType();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
