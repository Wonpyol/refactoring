package com.study.refactoring._21_alternative_classes_with_different_interfaces._02_after;

public class EmailNotification implements NotificationService{
    private EmailService emailService;

    public EmailNotification(EmailService emailService) {
        this.emailService = emailService;
    }

    @Override
    public void send(Notification notification) {
        EmailMessage emailMessage = new EmailMessage();
        emailMessage.setTitle(notification.getTitle());
        emailMessage.setTo(notification.getReceiver());
        emailMessage.setFrom(notification.getSender());
        emailService.sendEmail(emailMessage);


    }
}
