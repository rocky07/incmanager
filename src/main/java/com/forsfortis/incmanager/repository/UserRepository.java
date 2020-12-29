package com.forsfortis.incmanager.repository;

import java.util.Optional;

import com.forsfortis.incmanager.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

       Optional<User> findByEmail(String first_name);

}
