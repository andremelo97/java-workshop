package com.melo.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.melo.demo.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
