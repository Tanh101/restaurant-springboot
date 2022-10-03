package com.example.crossguild.service.impl;

import java.util.List;
import java.util.Optional;

import com.example.crossguild.model.Restaurant;
import com.example.crossguild.repo.RestaurantRepository;
import com.example.crossguild.service.IRestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class RestaurantServiceImpl implements IRestaurantService {

    @Autowired
    private RestaurantRepository restaurantRepository;

    @Override
    public List<Restaurant> getAll() {
        return restaurantRepository.findAll();
    }

    @Override
    public Optional<Restaurant> getById(Long id) {
        return Optional.ofNullable(restaurantRepository.findById(id)
                .orElseThrow(() -> new UsernameNotFoundException("Restaurant by " + id + " can not found")));
    }

    @Override
    public Restaurant save(Restaurant entity) {
        return restaurantRepository.save(entity);
    }

    @Override
    public Restaurant update(Restaurant entity) {
        return restaurantRepository.save(entity);
    }

    @Override
    public void deleteById(Long id) {
         restaurantRepository.deleteById(id);
    }



}
