package com.notification.model;

import java.util.Date;

public abstract class Notification {
    private Date timestamp;
    private NotificationType notificationType;
    private String message;

    public Notification(String message, NotificationType notificationType){
        this.timestamp = new Date();
        this.message = message;
        this.notificationType = notificationType;
    }
    public abstract void sendNotification();

    @Override
    public String toString() {
        return String.format("Date : %s, \n NotificationType : %s, \n Message: %s \n",
                this.timestamp.toString(), this.notificationType.toString(),
                this.message);
    }

}
