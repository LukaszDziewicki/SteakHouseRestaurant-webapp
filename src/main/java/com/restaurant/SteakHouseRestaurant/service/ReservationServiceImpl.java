package com.restaurant.SteakHouseRestaurant.service;

import com.restaurant.SteakHouseRestaurant.model.Reseravation;
import com.restaurant.SteakHouseRestaurant.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ReservationServiceImpl implements ReservationService{

    @Autowired
    ReservationRepository reservationRepository;

    @Override
    public void save(Reseravation reservation) {
        reservationRepository.save(reservation);
    }

    @Override
    public List<Reseravation> listAll() {
      return   reservationRepository.findAll();
    }
}
