package com.shrew.consulting.eagleeye.msp.employee.service.controllers;

import com.shrew.consulting.eagleeye.msp.employee.service.model.Employee;
import com.shrew.consulting.eagleeye.msp.employee.service.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("v1/employees")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeRepository employeeRepository;

    @PutMapping
    public Employee saveEmployee(@ModelAttribute Employee employee) {
        return employeeRepository.save(employee);
    }

    @GetMapping
    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    @GetMapping("{employeeId}")
    public Employee getEmployee(@PathVariable long employeeId) {
        Optional<Employee> employee = employeeRepository.findById(employeeId);
        if (employee.isPresent()) {
            return employee.get();
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "employee not found: " + employeeId);
    }

}