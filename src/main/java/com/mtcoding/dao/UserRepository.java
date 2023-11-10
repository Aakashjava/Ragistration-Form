package com.mtcoding.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mtcoding.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
