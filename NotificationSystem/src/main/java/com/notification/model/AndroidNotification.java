package com.notification.model;

import com.notification.adapter.android.AndroidNotificationAdapter;
import com.notification.adapter.android.FirebaseAndroidNotificationAdapter;


public class AndroidNotification extends Notification{
    private String deviceId;
    private String portId;
    private String notificationHeading;
    private AndroidNotificationAdapter androidNotificationAdapter;

    private AndroidNotification(String message) {
        super(message, NotificationType.ANDROID);
    }

    public static Builder builder(){
        return new Builder();
    }
    @Override
    public void sendNotification() {
        this.androidNotificationAdapter.send(this);
    }

    @Override
    public String toString() {
        return super.toString()
                + String.format("DeviceID : %s, PortID : %s, NotificationHeading : %s",
                this.deviceId, this.portId, this.notificationHeading);
    }


    public static class Builder {
        private String message;
        private String deviceId;
        private String portId;
        private String notificationHeading;

        private AndroidNotificationAdapter androidNotificationAdapter;

        public Builder message(String message){
            this.message = message;
            return this;
        }
        public Builder deviceId(String deviceId){
            this.deviceId = deviceId;
            return this;
        }
        public Builder portId(String portId){
            this.portId = portId;
            return this;
        }
        public Builder notificationHeading(String notificationHeading){
            this.notificationHeading = notificationHeading;
            return this;
        }

        public Builder notificationAdapter(AndroidNotificationAdapter androidNotificationAdapter){
            this.androidNotificationAdapter = androidNotificationAdapter;
            return this;
        }
        public AndroidNotification build(){
            AndroidNotification notification = new AndroidNotification(message);
            if(this.androidNotificationAdapter == null){
                this.androidNotificationAdapter = new FirebaseAndroidNotificationAdapter();
            }
            notification.androidNotificationAdapter = this.androidNotificationAdapter;
            notification.notificationHeading = this.notificationHeading;
            notification.deviceId = this.deviceId;
            notification.portId = this.portId;

            return notification;
        }
    }
}
