package com.sampleProject.EmployeeSystem.repository;

import com.sampleProject.EmployeeSystem.entity.Designation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DesignationRepository extends JpaRepository<Designation,Long> {
}
