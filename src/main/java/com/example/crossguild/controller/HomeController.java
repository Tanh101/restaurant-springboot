package com.example.crossguild.controller;

import com.example.crossguild.model.Restaurant;
import com.example.crossguild.service.impl.RestaurantServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/home")
public class HomeController {
    @Autowired
    private RestaurantServiceImpl restaurantService;

    @PostMapping("/add")
    public Restaurant newRestaurant(@RequestBody Restaurant restaurant) {
        return restaurantService.save(restaurant);
    }

    @GetMapping("/restaurant")
    public List<Restaurant> findAll(){
        return restaurantService.getAll();
    }
}
