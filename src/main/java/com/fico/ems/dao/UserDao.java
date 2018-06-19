package com.fico.ems.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fico.ems.model.User;

public interface UserDao extends JpaRepository<User, Integer> {
User findByEmail(String email);

}
