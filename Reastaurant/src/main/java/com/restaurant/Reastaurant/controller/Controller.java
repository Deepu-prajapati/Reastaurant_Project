package com.restaurant.Reastaurant.controller;

import com.example.RestaurantModel.restaurantModel.Restaurant;
import com.restaurant.Reastaurant.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

@RestController
@RequestMapping("/api/restaurant")
public class Controller {
    @Autowired
    private final Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @PostMapping("/restaurant/information")
    public void saveRestaurant(@RequestBody Restaurant restaurant){
        service.addInfo(restaurant);
    }
    @GetMapping("getRestaurantAvailability")
    public ArrayList<Restaurant> getAddOfRestaurant(){
        return service.getAll();
    }
    @GetMapping("RestaurantMahadev/name/{name}/")
    public Restaurant restaurantName(@PathVariable String name){
        return service.getbyname(name);
    }

}