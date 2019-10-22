package com.example.demo.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.infrastructure.entity.UserEntity;

public interface UserJpaRepository extends JpaRepository<UserEntity, String> {
}
