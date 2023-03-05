package com.study.refactoring._21_alternative_classes_with_different_interfaces._02_after;

public class EmailMessage extends NotificationMessage {
    public void setFrom(String from) {
    }

    @Override
    void setMessage(String message) {
        
    }

    @Override
    void setFor(String email) {

    }
}
