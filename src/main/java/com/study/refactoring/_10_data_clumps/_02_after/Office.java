package com.study.refactoring._10_data_clumps._02_after;

public class Office {
    private TelephoneNumber officePhoneNumber;
    private String location;

    public Office(TelephoneNumber officePhoneNumber, String location) {
        this.officePhoneNumber = officePhoneNumber;
        this.location = location;
    }
    public String officePhoneNumber() {
        return this.officePhoneNumber.toString();
    }

    public String getOfficeAreCode() {
        return this.officePhoneNumber.getAreaCode();
    }

    public void setOfficeAreCode(String officeAreCode) {
        this.officePhoneNumber.setAreaCode(officeAreCode);
    }

    public String getOfficeNumber() {
        return this.officePhoneNumber.getNumber();
    }

    public void setOfficeNumber(String officeNumber) {
        this.officePhoneNumber.setNumber(officeNumber);
    }
}
