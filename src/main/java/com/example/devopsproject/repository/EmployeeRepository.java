package com.example.devopsproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.devopsproject.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {}
