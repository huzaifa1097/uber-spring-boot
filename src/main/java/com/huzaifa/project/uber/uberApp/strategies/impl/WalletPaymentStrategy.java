package com.huzaifa.project.uber.uberApp.strategies.impl;

import com.huzaifa.project.uber.uberApp.entities.Driver;
import com.huzaifa.project.uber.uberApp.entities.Payment;
import com.huzaifa.project.uber.uberApp.entities.Ride;
import com.huzaifa.project.uber.uberApp.entities.Rider;
import com.huzaifa.project.uber.uberApp.entities.enums.PaymentStatus;
import com.huzaifa.project.uber.uberApp.entities.enums.TransactionMethod;
import com.huzaifa.project.uber.uberApp.repositories.PaymentRepository;
import com.huzaifa.project.uber.uberApp.services.PaymentService;
import com.huzaifa.project.uber.uberApp.services.WalletService;
import com.huzaifa.project.uber.uberApp.strategies.PaymentStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class WalletPaymentStrategy implements PaymentStrategy {

    private final WalletService walletService;
    private final PaymentRepository paymentRepository;

    @Override
    @Transactional
    public void processPayment(Payment payment) {
        Driver driver = payment.getRide().getDriver();
        Rider rider = payment.getRide().getRider();

        walletService.deductedMoneyFromWallet(rider.getUser(),
                payment.getAmount(), null,payment.getRide(), TransactionMethod.RIDE);

        Double driversCut = payment.getAmount() * (1- PLATFORM_COMMISSION);

        walletService.addMoneyToWallet(driver.getUser(),
                driversCut,null, payment.getRide(), TransactionMethod.RIDE);

        payment.setPaymentStatus(PaymentStatus.CONFIRMED);
        paymentRepository.save(payment);
    }
}
