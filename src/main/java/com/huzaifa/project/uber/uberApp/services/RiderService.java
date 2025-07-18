package com.huzaifa.project.uber.uberApp.services;

import com.huzaifa.project.uber.uberApp.dto.DriverDto;
import com.huzaifa.project.uber.uberApp.dto.RideDto;
import com.huzaifa.project.uber.uberApp.dto.RideRequestDto;
import com.huzaifa.project.uber.uberApp.dto.RiderDto;
import com.huzaifa.project.uber.uberApp.entities.Rider;
import com.huzaifa.project.uber.uberApp.entities.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

public interface RiderService {

    RideRequestDto requestRide(RideRequestDto rideRequestDto);

    RideDto cancelRide(Long rideId);


    DriverDto rateDriver(Long rideId, Integer rating);

    RiderDto getMyProfile();

    Page<RideDto> getAllMyRides(PageRequest pageRequest);

    Rider createNewRider(User user);

    Rider getCurrentRider();
}
