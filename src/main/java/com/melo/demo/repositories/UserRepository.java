package com.melo.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.melo.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
