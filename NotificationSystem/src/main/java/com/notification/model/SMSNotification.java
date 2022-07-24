package com.notification.model;

import com.notification.adapter.sms.BulkSMSNotificationAdapter;
import com.notification.adapter.sms.SMSNotificationAdapter;

import java.util.Date;

public class SMSNotification extends Notification{
    private String mobileNumber;
    private SMSNotificationAdapter smsNotificationAdapter;

    public SMSNotification(String message) {
        super(message, NotificationType.SMS);
    }

    @Override
    public void sendNotification() {
        this.smsNotificationAdapter.send(this);
    }

    @Override
    public String toString() {
        return super.toString()
                + ", Mobile Number " + this.mobileNumber;
    }
}
