package com.fico.ems.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fico.ems.model.Employee;
@Repository
public interface EMSDao extends JpaRepository<Employee, Integer> {
Employee findByEmail(String email);
}
