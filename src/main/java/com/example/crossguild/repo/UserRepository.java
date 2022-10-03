package com.example.crossguild.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crossguild.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
