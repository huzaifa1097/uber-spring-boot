package com.huzaifa.project.uber.uberApp.strategies;


import com.huzaifa.project.uber.uberApp.entities.enums.PaymentMethod;
import com.huzaifa.project.uber.uberApp.strategies.impl.CashPaymentStrategy;
import com.huzaifa.project.uber.uberApp.strategies.impl.WalletPaymentStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PaymentStrategyManager {

    private final WalletPaymentStrategy walletPaymentStrategy;
    private final CashPaymentStrategy cashPaymentStrategy;

    public PaymentStrategy paymentStrategy(PaymentMethod paymentMethod){
        return switch (paymentMethod){
            case WALLET -> walletPaymentStrategy;
            case CASH -> cashPaymentStrategy;

        };
    }

}
