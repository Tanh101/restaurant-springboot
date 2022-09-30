package com.example.crossguild.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crossguild.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
