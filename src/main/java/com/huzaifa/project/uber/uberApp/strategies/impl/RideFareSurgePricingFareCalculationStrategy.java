package com.huzaifa.project.uber.uberApp.strategies.impl;

import com.huzaifa.project.uber.uberApp.entities.RideRequest;
import com.huzaifa.project.uber.uberApp.services.DistanceService;
import com.huzaifa.project.uber.uberApp.strategies.RideFareCalculationStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RideFareSurgePricingFareCalculationStrategy implements RideFareCalculationStrategy {
    private final DistanceService distanceService;
    private static final double SURGE_FACTOR = 2;

    @Override
    public double calculateFare(RideRequest rideRequest) {
        double distance = distanceService.calculateDistance(rideRequest.getPickupLocation(),
                rideRequest.getDropOffLocation());
        return distance * RIDE_FARE_MULTIPLIER*SURGE_FACTOR;
    }
}