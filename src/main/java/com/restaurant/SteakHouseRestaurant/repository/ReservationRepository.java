package com.restaurant.SteakHouseRestaurant.repository;

import com.restaurant.SteakHouseRestaurant.model.Reseravation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReservationRepository extends JpaRepository<Reseravation, Long> {
    @Override
    List<Reseravation> findAll();
}
