package com.huzaifa.project.uber.uberApp.repositories;

import com.huzaifa.project.uber.uberApp.entities.Driver;
import com.huzaifa.project.uber.uberApp.entities.Ride;
import com.huzaifa.project.uber.uberApp.entities.Rider;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RideRepository extends JpaRepository<Ride, Long> {
    Page<Ride> findByRider(Rider rider, Pageable pageRequest);

    Page<Ride> findByDriver(Driver driver, Pageable pageRequest);
}
