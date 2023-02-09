package com.study.refactoring._06_mutable_data.separate_query_from_modifier._02_after;

import java.util.List;

public class Criminal {

    public void alertForMiscreant(List<Person> people) {
        if (!findForMiscreant(people).isBlank()) setOffAlarms();
    }

    public String findForMiscreant(List<Person> people) {
        for (Person p : people) {
            if (p.getName().equals("Don")) {
                return "Don";
            }
            if (p.getName().equals("John")) {
                return "John";
            }
        }
        return "";
    }

    private void setOffAlarms() {
        System.out.println("set off alarm");
    }
}
