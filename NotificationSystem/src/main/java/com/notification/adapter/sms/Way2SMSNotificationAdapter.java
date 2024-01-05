package com.notification.adapter.sms;

import com.notification.model.SMSNotification;

public class Way2SMSNotificationAdapter implements SMSNotificationAdapter{
    @Override
    public void send(SMSNotification smsNotification) {
        System.out.println("SMS (WayToSMS)-> SEND NOTIFICATION. " + smsNotification.toString());
    }
}
