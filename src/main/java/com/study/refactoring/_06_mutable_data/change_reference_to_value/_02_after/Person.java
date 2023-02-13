package com.study.refactoring._06_mutable_data.change_reference_to_value._02_after;

public class Person {

    private TelephoneNumber officeTelephoneNumber;

    public Person(TelephoneNumber officeTelephoneNumber) {
        this.officeTelephoneNumber = officeTelephoneNumber;
    }

    public String findOfficeAreaCode() {
        return this.officeTelephoneNumber.areaCode();
    }

    public void officeAreaCode(String areaCode) {
        this.officeTelephoneNumber = new TelephoneNumber(areaCode, this.officeTelephoneNumber.number());
    }

    public String findOfficeNumber() {
        return this.officeTelephoneNumber.number();
    }

    public void officeNumber(String number) {
        this.officeTelephoneNumber = new TelephoneNumber(this.officeTelephoneNumber.areaCode(), number);
    }

}
