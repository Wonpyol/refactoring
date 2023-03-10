package com.study.refactoring._21_alternative_classes_with_different_interfaces._02_after;

public class OrderAlerts {
    private NotificationService notificationService;

    public OrderAlerts(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void alertShipped(Order order) {
        Notification notification = Notification.newNotification(order.toString() + " is shipped").sender(order.getEmail());
        notificationService.send(notification);
    }
}
