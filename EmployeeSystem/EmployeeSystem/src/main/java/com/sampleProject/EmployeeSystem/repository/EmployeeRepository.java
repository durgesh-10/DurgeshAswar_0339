package com.sampleProject.EmployeeSystem.repository;

import com.sampleProject.EmployeeSystem.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
