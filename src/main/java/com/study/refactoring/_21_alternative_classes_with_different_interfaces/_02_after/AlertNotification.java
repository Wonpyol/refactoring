package com.study.refactoring._21_alternative_classes_with_different_interfaces._02_after;

public class AlertNotification implements NotificationService{
    private AlertService alertService;

    public AlertNotification(AlertService alertService) {
        this.alertService = alertService;
    }

    @Override
    public void send(Notification notification) {
        AlertMessage alertMessage = new AlertMessage();
        alertMessage.setMessage(notification.getTitle());
        alertMessage.setFor(notification.getSender());
        alertService.add(alertMessage);


    }
}
