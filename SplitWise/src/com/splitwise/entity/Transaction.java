package com.splitwise.entity;

/**
 * The Transaction Class
 *  - This class need to be immutable
 *  - Using builder class for creating object.
 *
 *  */

public class Transaction {
    private User sender;
    private User reciever;
    private int amount;
    private String description;

    public User getSender() {
        return sender;
    }

    public User getReciever() {
        return reciever;
    }

    public int getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

    public static Builder getBuilder(){
        return new Builder();
    }


    private Transaction(Builder builder){
        this.amount = builder.amount;
        this.description = builder.description;
        this.reciever = builder.reciever;
        this.sender = builder.sender;
    }

    public static class Builder{
        private User sender;
        private User reciever;
        private int amount;
        private String description;

        public Builder(){}

        public User getSender() {
            return sender;
        }

        public Builder setSender(User sender) {
            this.sender = sender;
            return this;
        }

        public User getReciever() {
            return reciever;
        }

        public Builder setReciever(User reciever) {
            this.reciever = reciever;
            return this;
        }

        public int getAmount() {
            return amount;
        }

        public Builder setAmount(int amount) {
            this.amount = amount;
            return this;
        }

        public String getDescription() {
            return description;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Transaction build(){
            return new Transaction(this);
        }
    }

}
