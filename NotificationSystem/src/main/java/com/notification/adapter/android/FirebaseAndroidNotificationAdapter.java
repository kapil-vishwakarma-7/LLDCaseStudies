package com.notification.adapter.android;

import com.notification.model.AndroidNotification;

public class FirebaseAndroidNotificationAdapter implements AndroidNotificationAdapter {
    @Override
    public void send(AndroidNotification notification) {
        System.out.println("ANA -> SEND NOTIFICATION. " + notification.toString());
    }
}
