package com.study.refactoring._06_mutable_data.change_reference_to_value._01_before;

public class Person {
    private TelephoneNumber officeTelephoneNumber;
    public String officeAreaCode() {
        return this.officeTelephoneNumber.areaCode();

    }
    public void officeAreaCode(String areaCode) {
        this.officeTelephoneNumber.areaCode(areaCode);
    }

    public String officeNumber() {
        return this.officeTelephoneNumber.number();
    }

    public void officeNumber(String number) {
        this.officeTelephoneNumber.number(number);
    }

}
