package com.restaurant.SteakHouseRestaurant.controller;

import com.restaurant.SteakHouseRestaurant.model.Reseravation;
import com.restaurant.SteakHouseRestaurant.service.ReservationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private ReservationServiceImpl reservationService;


    @GetMapping("/index")
    public String index(Model model){
        model.addAttribute("reservation", new Reseravation());
        return "index";
    }

    @GetMapping("/index/reservations")
    public String reservations(Model model){
        List<Reseravation> reseravationList = reservationService.listAll();
        model.addAttribute("reservationList", reseravationList);
        return "reservations";
    }

    @PostMapping("/index/saveReservation")
    public String saveReservation(Reseravation reseravation,
                                  @RequestParam("name") String name,
                                  @RequestParam("surname") String surname,
                                  @RequestParam("email") String email,
                                  @RequestParam("location") String location,
                                  @RequestParam("table") String table,
                                  @RequestParam("hour") String hour,
                                  @RequestParam("date") String date,
                                  @RequestParam("howLong") String howLong,
                                  @RequestParam("message") String message
                                  ) {
        reseravation.setName(name);
        reseravation.setSurname(surname);
        reseravation.setEmail(email);
        reseravation.setLocation(location);
        reseravation.setMessage(message);
        reseravation.setTable(table);
        reseravation.setHour(hour);
        reseravation.setDate(date);
        reseravation.setHowLong(howLong);

        reservationService.save(reseravation);
        return "redirect:/index";
    }
}
