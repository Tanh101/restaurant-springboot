package com.example.crossguild.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crossguild.model.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long>{
    
}
