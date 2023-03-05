package com.study.refactoring._21_alternative_classes_with_different_interfaces._02_after;

public class OrderProcessor {

    private EmailService emailService;

    public void notifyShipping(Shipping shipping) {
        EmailMessage emailMessage = new EmailMessage();
        emailMessage.setMessage(shipping.getOrder() + " is shipped");
        emailMessage.setFor(shipping.getEmail());
        emailMessage.setFrom("no-reply@whiteship.com");
        emailService.sendEmail(emailMessage);
    }
}
