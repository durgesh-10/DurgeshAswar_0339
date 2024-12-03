package com.sampleProject.EmployeeSystem.service;

import com.sampleProject.EmployeeSystem.dto.EmployeeDto;
import com.sampleProject.EmployeeSystem.entity.Employee;
import com.sampleProject.EmployeeSystem.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public Employee addData(EmployeeDto employeeDto){
        Employee emp = new Employee();
        emp.setEmployeeId(0L);
        emp.setEmployeeFirstName(emp.getEmployeeFirstName());
        emp.setEmployeeLastName(emp.getEmployeeLastName());
        emp.setEmployeeAge(emp.getEmployeeAge());
        emp.setEmployeeAddress(emp.getEmployeeAddress());
        emp.setEmail(employeeDto.getEmail());
        emp.setActive(true);

        emp.setCreatedBy(emp.getCreatedBy());
        emp.setCreatedData(emp.getCreatedData());
        emp.setUpdatedBy(emp.getUpdatedBy());
        emp.setUpdatedDate(emp.getUpdatedDate());
        return employeeRepository.save(emp);
    }

    }

