package com.notification.adapter.email;

import com.notification.model.EmailNotification;

public class LinuxEmailNotificationAdapter implements EmailNotificationAdapter{
    @Override
    public void send(EmailNotification emailNotification) {
        System.out.println("ENA -> SEND NOTIFICATION. " + emailNotification.toString());
    }
}
