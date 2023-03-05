package com.study.refactoring._21_alternative_classes_with_different_interfaces._02_after;

public abstract class NotificationMessage {
    abstract void setMessage(String message);
    abstract void setFor(String email);
}
