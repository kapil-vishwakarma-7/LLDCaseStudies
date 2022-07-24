package com.notification.adapter.ios;

import com.notification.model.ISONotification;

public class ICloudIosNotificationAdapter implements IOSNotificationAdapter{

    @Override
    public void send(ISONotification isoNotification) {
        System.out.println("INA -> SEND NOTIFICATION. " + isoNotification.toString());
    }
}
