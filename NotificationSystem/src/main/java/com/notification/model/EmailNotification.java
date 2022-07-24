package com.notification.model;

import com.notification.adapter.email.EmailNotificationAdapter;

import java.util.Date;

public class EmailNotification extends Notification{
    private String email;
    private EmailNotificationAdapter emailNotificationAdapter;

    public EmailNotification(String message) {
        super(message, NotificationType.EMAIL);
    }

    @Override
    public void sendNotification() {
        this.emailNotificationAdapter.send(this);
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Email : %s", this.email);
    }
}
