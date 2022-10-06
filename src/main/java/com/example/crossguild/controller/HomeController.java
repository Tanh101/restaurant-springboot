package com.example.crossguild.controller;

import com.example.crossguild.model.Restaurant;
import com.example.crossguild.service.impl.RestaurantServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.cert.PKIXRevocationChecker.Option;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/home")
public class HomeController {
    private final RestaurantServiceImpl restaurantServiceImpl;

    @Autowired
    public HomeController(RestaurantServiceImpl restaurantServiceImpl) {
        this.restaurantServiceImpl = restaurantServiceImpl;
    }

    @PostMapping("/add")
    public ResponseEntity<Restaurant> newRestaurant(@RequestBody Restaurant restaurant) {
        Restaurant newRestaurant = restaurantServiceImpl.save(restaurant);
        return new ResponseEntity<>(newRestaurant, HttpStatus.CREATED);
    }

    @GetMapping("/restaurant")
    public ResponseEntity<List<Restaurant>> getAll() {
        return new ResponseEntity<>(restaurantServiceImpl.getAll(), HttpStatus.OK);
    }

    @GetMapping("/restaurant/{id}")
    public ResponseEntity<Optional<Restaurant>> findByID(@PathVariable("id") Long id) {
        return new ResponseEntity<>(restaurantServiceImpl.getById(id), HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Restaurant> update(@RequestBody Restaurant restaurant) {
        return new ResponseEntity<>(restaurantServiceImpl.update(restaurant), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Restaurant> delete(@PathVariable("id") Long id) {
        restaurantServiceImpl.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);

    }

}
