package com.huzaifa.project.uber.uberApp.repositories;

import com.huzaifa.project.uber.uberApp.entities.Payment;
import com.huzaifa.project.uber.uberApp.entities.Ride;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
    Optional<Payment> findByRide(Ride ride);
}
