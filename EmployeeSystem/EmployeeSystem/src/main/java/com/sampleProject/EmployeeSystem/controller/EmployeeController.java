package com.sampleProject.EmployeeSystem.controller;


import com.sampleProject.EmployeeSystem.dto.EmployeeDto;
import com.sampleProject.EmployeeSystem.entity.Employee;
import com.sampleProject.EmployeeSystem.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.http.HttpStatus.CREATED;

@Controller
@RequestMapping
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/addData")
    public ResponseEntity<Employee>addData(EmployeeDto employeeDto){
        return  new ResponseEntity<>(employeeService.addData(employeeDto),CREATED);
    }



}
