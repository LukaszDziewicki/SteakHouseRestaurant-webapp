package com.restaurant.SteakHouseRestaurant.service;


import com.restaurant.SteakHouseRestaurant.model.Reseravation;

import java.util.List;

public interface ReservationService {
    void save(Reseravation reservation);
    List<Reseravation> listAll();
}
