package com.notification.client;

import com.notification.model.AndroidNotification;
import com.notification.model.Notification;

public class Client {
    public static void main(String[] args) {
        Notification androidNotification =
                AndroidNotification.builder()
                        .message("Test Android Notification")
                        .notificationHeading("Important Alert")
                        .deviceId("xy66-8800-1101-0220")
                        .portId("tcp:9001")
                        .build();
        androidNotification.sendNotification();

    }
}
