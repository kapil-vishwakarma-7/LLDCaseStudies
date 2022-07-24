package com.splitwise.service;

import com.splitwise.entity.Transaction;
import com.splitwise.entity.User;

import java.util.Map;

public class TransactionService {
    public void addTransaction(User sender, User reciever, int amount, String description){
        Transaction transaction = Transaction.getBuilder()
                .setAmount(123)
                .setReciever(reciever)
                .setSender(sender)
                .setDescription(description).build();
        Map<Character, Integer> map;

    }
}
