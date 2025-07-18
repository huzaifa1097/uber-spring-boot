package com.huzaifa.project.uber.uberApp.services.impl;

import com.huzaifa.project.uber.uberApp.entities.RideRequest;
import com.huzaifa.project.uber.uberApp.exceptions.ResourceNotFoundException;
import com.huzaifa.project.uber.uberApp.repositories.RideRequestRepository;
import com.huzaifa.project.uber.uberApp.services.RideRequestService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RideRequestServiceImpl implements RideRequestService {

    private final RideRequestRepository rideRequestRepository;

    @Override
    public RideRequest findRideRequestById(Long rideRequestId) {
        return rideRequestRepository.findById(rideRequestId)
                .orElseThrow(()-> new ResourceNotFoundException("RideRequest not found with id "+ rideRequestId));
    }

    @Override
    public void update(RideRequest rideRequest) {
        RideRequest toSave = rideRequestRepository.findById(rideRequest.getId())
                .orElseThrow(()-> new ResourceNotFoundException("RideRequest not found with id" + rideRequest.getId()));
        rideRequestRepository.save(rideRequest);

    }
}
