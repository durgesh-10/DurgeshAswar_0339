package com.sampleProject.EmployeeSystem.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class EmployeeDto {
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
