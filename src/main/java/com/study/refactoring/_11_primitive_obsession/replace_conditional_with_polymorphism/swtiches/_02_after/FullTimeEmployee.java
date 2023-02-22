package com.study.refactoring._11_primitive_obsession.replace_conditional_with_polymorphism.swtiches._02_after;

import java.util.List;

public class FullTimeEmployee extends Employee{
    public FullTimeEmployee() {
    }
    @Override
    public int vacationHours() {
        return 120;
    }
    @Override
    public boolean canAccessTo(String project){
        return true;
    }
}
