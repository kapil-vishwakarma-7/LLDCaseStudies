package com.notification.adapter.sms;

import com.notification.model.SMSNotification;

public class BulkSMSNotificationAdapter implements SMSNotificationAdapter {

    @Override
    public void send(SMSNotification smsNotification) {
        System.out.println("SNA -> SEND NOTIFICATION. " + smsNotification.toString());
    }
}
