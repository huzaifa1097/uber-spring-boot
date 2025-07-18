package com.huzaifa.project.uber.uberApp.strategies;

import com.huzaifa.project.uber.uberApp.entities.Driver;
import com.huzaifa.project.uber.uberApp.entities.RideRequest;

import java.util.List;

public interface DriverMatchingStrategy {
    List<Driver> findMatchingDriver(RideRequest rideRequest);
}
