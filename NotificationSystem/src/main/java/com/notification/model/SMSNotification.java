package com.notification.model;

import com.notification.adapter.sms.BulkSMSNotificationAdapter;
import com.notification.adapter.sms.SMSNotificationAdapter;
import com.notification.exception.InvalidMobileNumberException;

import java.util.Date;

public class SMSNotification extends Notification{
    private String mobileNumber;
    private SMSNotificationAdapter smsNotificationAdapter;

    public SMSNotification(String message, String mobileNumber, SMSNotificationAdapter smsNotificationAdapter) {
        super(message, NotificationType.SMS);
        this.mobileNumber = mobileNumber;
        this.smsNotificationAdapter = smsNotificationAdapter;
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
    public static Builder builder(){
        return new Builder();
    }
    public static class Builder{
        private String message;
        private String mobileNumber;

        private SMSNotificationAdapter smsNotificationAdapter;

        public Builder message(String message){
            this.message = message;
            return this;
        }
        public  Builder mobileNumber(String mobileNumber){
            this.mobileNumber = mobileNumber;
            return this;
        }

        public Builder smsNotificationAdapter(SMSNotificationAdapter smsNotificationAdapter){
            this.smsNotificationAdapter = smsNotificationAdapter;
            return this;
        }

        public SMSNotification build() throws InvalidMobileNumberException {
            validateMobileNumber(this.mobileNumber);
            if(this.smsNotificationAdapter == null) {
                this.smsNotificationAdapter = new BulkSMSNotificationAdapter();
            }
            return new SMSNotification(this.message, this.mobileNumber, this.smsNotificationAdapter);
        }

        private void validateMobileNumber(String mobileNumber) throws InvalidMobileNumberException {
            if(this.mobileNumber == null || mobileNumber.length() != 10){
                throw new InvalidMobileNumberException(this.mobileNumber);
            }
        }
    }
}
