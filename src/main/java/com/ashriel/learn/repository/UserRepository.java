package com.ashriel.learn.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashriel.learn.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findById(Long id);
    Optional<User> deleteById(Long id);
}
