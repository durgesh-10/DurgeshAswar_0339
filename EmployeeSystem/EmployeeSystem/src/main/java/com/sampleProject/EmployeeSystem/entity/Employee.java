package com.sampleProject.EmployeeSystem.entity;

import  jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name="EmployeeInfo")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long employeeId;

    private  String employeeFirstName;
    private  String employeeLastName;
    private  String employeeAge;
    private  String employeeContactNumber;
    private  String employeeDOJ;
    private  String employeeAddress;
    private  String email;

    private  boolean isActive;
    private  String createdBy;
    private LocalDateTime createdData;
    private String updatedBy;
    private LocalDateTime updatedDate;
}