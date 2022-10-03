package com.example.crossguild.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crossguild.model.Restaurant;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Long>{
    
}
