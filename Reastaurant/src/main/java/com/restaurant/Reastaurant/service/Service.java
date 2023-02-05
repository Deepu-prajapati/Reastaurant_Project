package com.restaurant.Reastaurant.service;

import com.example.RestaurantModel.restaurantModel.Restaurant;

import java.util.ArrayList;
import java.util.function.Predicate;

@org.springframework.stereotype.Service

public class Service {
    private static ArrayList<Restaurant> list=new ArrayList<>();
    static{
        list.add(new Restaurant("JadugarofPohaJalebi",1024578,"Padam shree Palace","Poha Jalebi",20));
        list.add(new Restaurant("Idli Wala Cook",125487,"Bam Bhole Restaurant","Emarati",20));
        list.add(new Restaurant("Cook And Eat",2458799,"Dhakad Empire","Dal Batti Churma",45));
    }
    public void addInfo(Restaurant restaurant) {
        list.add(restaurant);
    }
    public ArrayList<Restaurant> getAll() {
        return list;
    }
    public Restaurant getbyname(String name) {
        Predicate<? super Restaurant> predicate = resto -> resto.getRestaurantName().equals(name);
        Restaurant resto = list.stream().filter(predicate).findFirst().get();
        return resto;
    }
}