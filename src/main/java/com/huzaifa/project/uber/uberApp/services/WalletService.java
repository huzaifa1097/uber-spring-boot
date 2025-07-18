package com.huzaifa.project.uber.uberApp.services;

import com.huzaifa.project.uber.uberApp.entities.Ride;
import com.huzaifa.project.uber.uberApp.entities.User;
import com.huzaifa.project.uber.uberApp.entities.Wallet;
import com.huzaifa.project.uber.uberApp.entities.enums.TransactionMethod;

public interface WalletService {

    Wallet addMoneyToWallet(User user, Double amount, String transactionId, Ride ride, TransactionMethod transactionMethod);

    Wallet deductedMoneyFromWallet(User user, Double amount, String transactionId, Ride ride, TransactionMethod transactionMethod);

    void withdrawAllMyMoneyFromWallet();

    Wallet findWalletById(Long walletId);

    Wallet createNewWallet(User user);

    Wallet findByUserId(User user);


}
