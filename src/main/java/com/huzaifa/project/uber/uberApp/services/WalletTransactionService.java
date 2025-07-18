package com.huzaifa.project.uber.uberApp.services;

import com.huzaifa.project.uber.uberApp.dto.WalletTransactionDto;
import com.huzaifa.project.uber.uberApp.entities.WalletTransaction;

public interface WalletTransactionService {

    void createNewWalletTransaction(WalletTransaction walletTransaction);
}
