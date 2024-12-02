package com.sampleProject.EmployeeSystem.repository;

import com.sampleProject.EmployeeSystem.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long> {

}
