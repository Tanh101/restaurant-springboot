package com.example.crossguild.controller;

import com.example.crossguild.model.Restaurant;
import com.example.crossguild.service.impl.RestaurantServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/home")
public class HomeController {
    @Autowired
    private RestaurantServiceImpl restaurantService;

    @PostMapping("/add")
    public String add(@RequestBody Restaurant restaurant) {
        restaurantService.save(restaurant);
        return "A new restaurant has been added";
    }

    @GetMapping("/restaurant")
    public String findAll(){
        restaurantService.getAll();
        return "aaa";
    }
}
