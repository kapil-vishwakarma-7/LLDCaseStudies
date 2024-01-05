package com.notification.exception;

public class InvalidMobileNumberException extends Exception{
    public InvalidMobileNumberException(String mobileNumber){
        super("Invalid Mobile Number - " + mobileNumber);
    }
}
