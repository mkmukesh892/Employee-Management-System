package com.fico.ems.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.fico.ems.model.Employee;
@RepositoryRestResource
public interface EMSDao extends JpaRepository<Employee, Integer> {
Employee findByEmail(String email);
}
