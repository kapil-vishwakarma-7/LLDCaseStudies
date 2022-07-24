package com.notification.model;

import com.notification.adapter.ios.IOSNotificationAdapter;

import java.util.Date;

public class ISONotification extends Notification{
    private String deviceID;
    private String userID;
    private IOSNotificationAdapter iosNotificationAdapter;
    public ISONotification(String message) {
        super(message, NotificationType.IOS);
    }

    @Override
    public void sendNotification() {
        iosNotificationAdapter.send(this);
    }

    @Override
    public String toString() {
        return super.toString()
                + String.format("DeviceID : %s, UserID: %s", this.deviceID, this.userID);
    }
}
