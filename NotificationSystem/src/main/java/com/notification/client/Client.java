package com.notification.client;

import com.notification.adapter.sms.Way2SMSNotificationAdapter;
import com.notification.exception.InvalidMobileNumberException;
import com.notification.model.AndroidNotification;
import com.notification.model.Notification;
import com.notification.model.SMSNotification;

public class Client {
    public static void main(String[] args) throws InvalidMobileNumberException {
        Notification androidNotification =
                AndroidNotification.builder()
                        .message("Test Android Notification")
                        .notificationHeading("Important Alert")
                        .deviceId("xy66-8800-1101-0220")
                        .portId("tcp:9001")
                        .build();
        androidNotification.sendNotification();


        Notification bulkSMSNotification = SMSNotification.builder()
                .message("Bulk SMS Notification")
                .mobileNumber("7999156361")
                .build();
        bulkSMSNotification.sendNotification();

        Notification way2SMSNotification = SMSNotification.builder()
                .mobileNumber("7999164220")
                .message("Way to SMS Notification")
                .smsNotificationAdapter(new Way2SMSNotificationAdapter())
                .build();

        way2SMSNotification.sendNotification();
    }
}
