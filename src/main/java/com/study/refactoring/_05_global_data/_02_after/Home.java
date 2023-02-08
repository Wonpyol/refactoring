package com.study.refactoring._05_global_data._02_after;

public class Home {

    public static void main(String[] args) {
        Thermostats.setTargetTemperature(68);
        Thermostats.setReadInFahrenheit(false);
    }
}
