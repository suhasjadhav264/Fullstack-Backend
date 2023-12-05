package com.zonezo.fullstack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zonezo.fullstack.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
