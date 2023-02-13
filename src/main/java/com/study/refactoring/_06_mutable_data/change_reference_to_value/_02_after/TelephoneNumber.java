package com.study.refactoring._06_mutable_data.change_reference_to_value._02_after;

public class TelephoneNumber {
    private String areaCode;
    private String number;
    public TelephoneNumber(String areaCode, String number) {
        this.areaCode = areaCode;
        this.number = number;
    }
    public String areaCode() {
        return areaCode;
    }
    public String number() {
        return number;
    }


}
